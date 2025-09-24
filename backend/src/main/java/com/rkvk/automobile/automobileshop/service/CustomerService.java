package com.rkvk.automobile.automobileshop.service;

import com.rkvk.automobile.automobileshop.dto.CustomerDTO;
import com.rkvk.automobile.automobileshop.dto.CustomerEmailDTO;
import com.rkvk.automobile.automobileshop.dto.CustomerMiddleNameDTO;
import com.rkvk.automobile.automobileshop.entity.Customer;
import com.rkvk.automobile.automobileshop.entity.CustomerEmail;
import com.rkvk.automobile.automobileshop.entity.CustomerMiddleName;
import com.rkvk.automobile.automobileshop.entity.id.CustomerEmailId;
import com.rkvk.automobile.automobileshop.entity.id.CustomerMiddleNameId;
import com.rkvk.automobile.automobileshop.exception.ResourceNotFoundException;
import com.rkvk.automobile.automobileshop.mapper.CustomerMapper;
import com.rkvk.automobile.automobileshop.repository.CustomerEmailRepository;
import com.rkvk.automobile.automobileshop.repository.CustomerMiddleNameRepository;
import com.rkvk.automobile.automobileshop.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMiddleNameRepository middleNameRepository;
    private final CustomerEmailRepository emailRepository;
    private final CustomerMapper customerMapper;

    public Customer addCustomer(CustomerDTO dto) {
        Customer customer = customerMapper.dtoToEntity(dto);
        Customer savedCustomer = customerRepository.save(customer);

        saveMiddleNamesAndEmails(savedCustomer, dto);

        return savedCustomer;
    }

    public Customer updateCustomer(Long id, CustomerDTO dto) {
        Customer existingCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));

        existingCustomer.setFirstName(dto.getFirstName());
        existingCustomer.setLastName(dto.getLastName());
        existingCustomer.setHouseNo(dto.getHouseNo());
        existingCustomer.setStreet(dto.getStreet());
        existingCustomer.setLocality(dto.getLocality());
        existingCustomer.setCity(dto.getCity());
        existingCustomer.setPinCode(dto.getPinCode());

        Customer savedCustomer = customerRepository.save(existingCustomer);

        // Replace old middle names & emails if new ones provided
        if (dto.getMiddleNames() != null) {
            middleNameRepository.deleteAll(middleNameRepository.findByIdCustomerId(id));
        }
        if (dto.getEmails() != null) {
            emailRepository.deleteAll(emailRepository.findByIdCustomerId(id));
        }

        saveMiddleNamesAndEmails(savedCustomer, dto);

        return savedCustomer;
    }

    public CustomerDTO getCustomerById(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));


        CustomerDTO dto = customerMapper.entityToDto(customer);
        dto.setCustomerId(customer.getCustomerId());

        // middle names
        List<CustomerMiddleNameDTO> middleNames = middleNameRepository.findByIdCustomerId(id)
                .stream()
                .map(m -> new CustomerMiddleNameDTO(
                        m.getId().getCustomerId(),
                        m.getId().getMiddleName(),
                        m.getMiddleNameOrder()
                ))
                .toList();
        dto.setMiddleNames(middleNames);

        // emails
        List<CustomerEmailDTO> emails = emailRepository.findByIdCustomerId(id)
                .stream()
                .map(e -> new CustomerEmailDTO(
                        e.getId().getCustomerId(),
                        e.getId().getEmail()
                ))
                .toList();
        dto.setEmails(emails);

        return dto;
    }

    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        return customers.stream().map(customer -> {
            CustomerDTO dto = customerMapper.entityToDto(customer);
            dto.setCustomerId(customer.getCustomerId());

            // middle names
            List<CustomerMiddleNameDTO> middleNames = middleNameRepository.findByIdCustomerId(customer.getCustomerId())
                    .stream()
                    .map(m -> new CustomerMiddleNameDTO(
                            m.getId().getCustomerId(),
                            m.getId().getMiddleName(),
                            m.getMiddleNameOrder()
                    ))
                    .toList();
            dto.setMiddleNames(middleNames);

            // emails
            List<CustomerEmailDTO> emails = emailRepository.findByIdCustomerId(customer.getCustomerId())
                    .stream()
                    .map(e -> new CustomerEmailDTO(
                            e.getId().getCustomerId(),
                            e.getId().getEmail()
                    ))
                    .toList();
            dto.setEmails(emails);

            return dto;
        }).toList();
    }

    public void deleteCustomer(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));

        customerRepository.delete(customer);
    }

    private void saveMiddleNamesAndEmails(Customer customer, CustomerDTO dto) {
        if (dto.getMiddleNames() != null) {
            for (CustomerMiddleNameDTO mDto : dto.getMiddleNames()) {
                CustomerMiddleNameId id = new CustomerMiddleNameId(customer.getCustomerId(), mDto.getMiddleName());
                CustomerMiddleName cmn = CustomerMiddleName.builder()
                        .id(id)
                        .middleNameOrder(mDto.getOrder())
                        .customer(customer)
                        .build();
                middleNameRepository.save(cmn);
            }
        }

        if (dto.getEmails() != null) {
            for (CustomerEmailDTO eDto : dto.getEmails()) {
                CustomerEmailId id = new CustomerEmailId(customer.getCustomerId(), eDto.getEmail());
                CustomerEmail ce = CustomerEmail.builder()
                        .id(id)
                        .customer(customer)
                        .build();
                emailRepository.save(ce);
            }
        }
    }
}
