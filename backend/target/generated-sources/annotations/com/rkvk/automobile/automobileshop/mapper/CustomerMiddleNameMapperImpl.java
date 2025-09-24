package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.CustomerMiddleNameDTO;
import com.rkvk.automobile.automobileshop.entity.CustomerMiddleName;
import com.rkvk.automobile.automobileshop.entity.id.CustomerMiddleNameId;
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
public class CustomerMiddleNameMapperImpl implements CustomerMiddleNameMapper {

    @Override
    public CustomerMiddleName dtoToEntity(CustomerMiddleNameDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CustomerMiddleName.CustomerMiddleNameBuilder customerMiddleName = CustomerMiddleName.builder();

        customerMiddleName.middleNameOrder( dto.getOrder() );

        customerMiddleName.id( new CustomerMiddleNameId(dto.getCustomerId(), dto.getMiddleName()) );

        return customerMiddleName.build();
    }

    @Override
    public CustomerMiddleNameDTO entityToDto(CustomerMiddleName entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerMiddleNameDTO customerMiddleNameDTO = new CustomerMiddleNameDTO();

        customerMiddleNameDTO.setCustomerId( entityIdCustomerId( entity ) );
        customerMiddleNameDTO.setMiddleName( entityIdMiddleName( entity ) );
        customerMiddleNameDTO.setOrder( entity.getMiddleNameOrder() );

        return customerMiddleNameDTO;
    }

    @Override
    public List<CustomerMiddleNameDTO> entityListToDtoList(List<CustomerMiddleName> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CustomerMiddleNameDTO> list = new ArrayList<CustomerMiddleNameDTO>( entities.size() );
        for ( CustomerMiddleName customerMiddleName : entities ) {
            list.add( entityToDto( customerMiddleName ) );
        }

        return list;
    }

    @Override
    public List<CustomerMiddleName> dtoListToEntityList(List<CustomerMiddleNameDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<CustomerMiddleName> list = new ArrayList<CustomerMiddleName>( dtos.size() );
        for ( CustomerMiddleNameDTO customerMiddleNameDTO : dtos ) {
            list.add( dtoToEntity( customerMiddleNameDTO ) );
        }

        return list;
    }

    private Long entityIdCustomerId(CustomerMiddleName customerMiddleName) {
        if ( customerMiddleName == null ) {
            return null;
        }
        CustomerMiddleNameId id = customerMiddleName.getId();
        if ( id == null ) {
            return null;
        }
        Long customerId = id.getCustomerId();
        if ( customerId == null ) {
            return null;
        }
        return customerId;
    }

    private String entityIdMiddleName(CustomerMiddleName customerMiddleName) {
        if ( customerMiddleName == null ) {
            return null;
        }
        CustomerMiddleNameId id = customerMiddleName.getId();
        if ( id == null ) {
            return null;
        }
        String middleName = id.getMiddleName();
        if ( middleName == null ) {
            return null;
        }
        return middleName;
    }
}
