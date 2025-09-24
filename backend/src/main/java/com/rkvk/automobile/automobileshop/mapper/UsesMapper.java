package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.UsesDTO;
import com.rkvk.automobile.automobileshop.entity.Uses;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsesMapper {

    UsesMapper INSTANCE = Mappers.getMapper(UsesMapper.class);

    @Mapping(source = "id.invoiceId", target = "invoiceId")
    @Mapping(source = "id.partId", target = "partId")
    @Mapping(source = "count", target = "count")
    UsesDTO toDto(Uses uses);

    @Mapping(source = "invoiceId", target = "id.invoiceId")
    @Mapping(source = "partId", target = "id.partId")
    @Mapping(source = "count", target = "count")
    Uses toEntity(UsesDTO usesDTO);
}
