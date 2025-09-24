package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.CustomerEmailDTO;
import com.rkvk.automobile.automobileshop.entity.CustomerEmail;
import com.rkvk.automobile.automobileshop.entity.id.CustomerEmailId;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-24T23:14:09+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25 (Oracle Corporation)"
)
@Component
public class CustomerEmailMapperImpl implements CustomerEmailMapper {

    @Override
    public CustomerEmail dtoToEntity(CustomerEmailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CustomerEmail.CustomerEmailBuilder customerEmail = CustomerEmail.builder();

        customerEmail.id( new CustomerEmailId(dto.getCustomerId(), dto.getEmail()) );

        return customerEmail.build();
    }

    @Override
    public CustomerEmailDTO entityToDto(CustomerEmail entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerEmailDTO customerEmailDTO = new CustomerEmailDTO();

        customerEmailDTO.setCustomerId( entityIdCustomerId( entity ) );
        customerEmailDTO.setEmail( entityIdEmail( entity ) );

        return customerEmailDTO;
    }

    @Override
    public List<CustomerEmailDTO> entityListToDtoList(List<CustomerEmail> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CustomerEmailDTO> list = new ArrayList<CustomerEmailDTO>( entities.size() );
        for ( CustomerEmail customerEmail : entities ) {
            list.add( entityToDto( customerEmail ) );
        }

        return list;
    }

    @Override
    public List<CustomerEmail> dtoListToEntityList(List<CustomerEmailDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<CustomerEmail> list = new ArrayList<CustomerEmail>( dtos.size() );
        for ( CustomerEmailDTO customerEmailDTO : dtos ) {
            list.add( dtoToEntity( customerEmailDTO ) );
        }

        return list;
    }

    private Long entityIdCustomerId(CustomerEmail customerEmail) {
        if ( customerEmail == null ) {
            return null;
        }
        CustomerEmailId id = customerEmail.getId();
        if ( id == null ) {
            return null;
        }
        Long customerId = id.getCustomerId();
        if ( customerId == null ) {
            return null;
        }
        return customerId;
    }

    private String entityIdEmail(CustomerEmail customerEmail) {
        if ( customerEmail == null ) {
            return null;
        }
        CustomerEmailId id = customerEmail.getId();
        if ( id == null ) {
            return null;
        }
        String email = id.getEmail();
        if ( email == null ) {
            return null;
        }
        return email;
    }
}
