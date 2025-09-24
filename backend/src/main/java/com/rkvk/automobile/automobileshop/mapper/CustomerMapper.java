package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.CustomerDTO;
import com.rkvk.automobile.automobileshop.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "middleNames", ignore = true)
    @Mapping(target = "emails", ignore = true)
    Customer dtoToEntity(CustomerDTO dto);

    @Mapping(target = "middleNames", ignore = true)
    @Mapping(target = "emails", ignore = true)
    CustomerDTO entityToDto(Customer customer);
}
