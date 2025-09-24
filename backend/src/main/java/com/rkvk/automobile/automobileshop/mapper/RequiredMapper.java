package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.RequiredDTO;
import com.rkvk.automobile.automobileshop.entity.Required;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RequiredMapper {

    RequiredMapper INSTANCE = Mappers.getMapper(RequiredMapper.class);

    @Mapping(source = "id.invoiceId", target = "invoiceId")
    @Mapping(source = "id.mechanicId", target = "mechanicId")
    @Mapping(source = "description", target = "description")
    RequiredDTO toDto(Required required);

    @Mapping(source = "invoiceId", target = "id.invoiceId")
    @Mapping(source = "mechanicId", target = "id.mechanicId")
    @Mapping(source = "description", target = "description")
    Required toEntity(RequiredDTO requiredDTO);
}
