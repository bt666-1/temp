package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.CustomerEmailDTO;
import com.rkvk.automobile.automobileshop.entity.CustomerEmail;
import com.rkvk.automobile.automobileshop.entity.id.CustomerEmailId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerEmailMapper {

    @Mapping(target = "id", expression = "java(new CustomerEmailId(dto.getCustomerId(), dto.getEmail()))")
    @Mapping(target = "customer", ignore = true)
    CustomerEmail dtoToEntity(CustomerEmailDTO dto);

    @Mapping(target = "customerId", source = "id.customerId")
    @Mapping(target = "email", source = "id.email")
    CustomerEmailDTO entityToDto(CustomerEmail entity);

    List<CustomerEmailDTO> entityListToDtoList(List<CustomerEmail> entities);
    List<CustomerEmail> dtoListToEntityList(List<CustomerEmailDTO> dtos);
}
