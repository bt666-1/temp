package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.CustomerDTO;
import com.rkvk.automobile.automobileshop.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-24T20:23:42+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer dtoToEntity(CustomerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.firstName( dto.getFirstName() );
        customer.lastName( dto.getLastName() );
        customer.houseNo( dto.getHouseNo() );
        customer.street( dto.getStreet() );
        customer.locality( dto.getLocality() );
        customer.city( dto.getCity() );
        customer.pinCode( dto.getPinCode() );

        return customer.build();
    }

    @Override
    public CustomerDTO entityToDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setFirstName( customer.getFirstName() );
        customerDTO.setLastName( customer.getLastName() );
        customerDTO.setHouseNo( customer.getHouseNo() );
        customerDTO.setStreet( customer.getStreet() );
        customerDTO.setLocality( customer.getLocality() );
        customerDTO.setCity( customer.getCity() );
        customerDTO.setPinCode( customer.getPinCode() );

        return customerDTO;
    }
}
