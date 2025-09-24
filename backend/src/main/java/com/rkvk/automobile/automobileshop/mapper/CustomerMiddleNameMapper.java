package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.CustomerMiddleNameDTO;
import com.rkvk.automobile.automobileshop.entity.CustomerMiddleName;
import com.rkvk.automobile.automobileshop.entity.id.CustomerMiddleNameId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMiddleNameMapper {

    @Mapping(target = "id", expression = "java(new CustomerMiddleNameId(dto.getCustomerId(), dto.getMiddleName()))")
    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "middleNameOrder", source = "order")
    CustomerMiddleName dtoToEntity(CustomerMiddleNameDTO dto);

    @Mapping(target = "customerId", source = "id.customerId")
    @Mapping(target = "middleName", source = "id.middleName")
    @Mapping(target = "order", source = "middleNameOrder")
    CustomerMiddleNameDTO entityToDto(CustomerMiddleName entity);

    List<CustomerMiddleNameDTO> entityListToDtoList(List<CustomerMiddleName> entities);
    List<CustomerMiddleName> dtoListToEntityList(List<CustomerMiddleNameDTO> dtos);
}
