package com.rkvk.automobile.automobileshop.service;

import com.rkvk.automobile.automobileshop.entity.Customer;
import com.rkvk.automobile.automobileshop.entity.CustomerEmail;
import com.rkvk.automobile.automobileshop.entity.CustomerMiddleName;
import com.rkvk.automobile.automobileshop.entity.id.CustomerEmailId;
import com.rkvk.automobile.automobileshop.entity.id.CustomerMiddleNameId;
import com.rkvk.automobile.automobileshop.repository.CustomerEmailRepository;
import com.rkvk.automobile.automobileshop.repository.CustomerMiddleNameRepository;
import com.rkvk.automobile.automobileshop.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMiddleNameRepository middleNameRepository;
    private final CustomerEmailRepository emailRepository;

    // Basic Customer CRUD

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Customer existingCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));

        existingCustomer.setFirstName(updatedCustomer.getFirstName());
        existingCustomer.setLastName(updatedCustomer.getLastName());
        existingCustomer.setHouseNo(updatedCustomer.getHouseNo());
        existingCustomer.setStreet(updatedCustomer.getStreet());
        existingCustomer.setLocality(updatedCustomer.getLocality());
        existingCustomer.setCity(updatedCustomer.getCity());
        existingCustomer.setPinCode(updatedCustomer.getPinCode());

        return customerRepository.save(existingCustomer);
    }

    public void deleteCustomer(Long id) {
        if (!customerRepository.existsById(id)) {
            throw new RuntimeException("Customer not found with id: " + id);
        }
        customerRepository.deleteById(id);
    }

    // Customer Middle Names

    public CustomerMiddleName addMiddleName(Long customerId, String middleName, int order) {
        CustomerMiddleNameId id = new CustomerMiddleNameId(customerId, middleName);
        CustomerMiddleName entity = CustomerMiddleName.builder()
                .id(id)
                .middleNameOrder(order)
                .customer(customerRepository.findById(customerId)
                        .orElseThrow(() -> new RuntimeException("Customer not found")))
                .build();
        return middleNameRepository.save(entity);
    }

    public List<CustomerMiddleName> getMiddleNames(Long customerId) {
        return middleNameRepository.findAll()
                .stream()
                .filter(m -> m.getId().getCustomerId().equals(customerId))
                .toList();
    }

    public void deleteMiddleName(Long customerId, String middleName) {
        CustomerMiddleNameId id = new CustomerMiddleNameId(customerId, middleName);
        middleNameRepository.deleteById(id);
    }

    // Customer Emails

    public CustomerEmail addEmail(Long customerId, String email) {
        CustomerEmailId id = new CustomerEmailId(customerId, email);
        CustomerEmail entity = CustomerEmail.builder()
                .id(id)
                .customer(customerRepository.findById(customerId)
                        .orElseThrow(() -> new RuntimeException("Customer not found")))
                .build();
        return emailRepository.save(entity);
    }

    public List<CustomerEmail> getEmails(Long customerId) {
        return emailRepository.findAll()
                .stream()
                .filter(e -> e.getId().getCustomerId().equals(customerId))
                .toList();
    }

    public void deleteEmail(Long customerId, String email) {
        CustomerEmailId id = new CustomerEmailId(customerId, email);
        emailRepository.deleteById(id);
    }
}
