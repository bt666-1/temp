package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.CanDoDTO;
import com.rkvk.automobile.automobileshop.entity.CanDo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CanDoMapper {

    CanDoMapper INSTANCE = Mappers.getMapper(CanDoMapper.class);

    @Mapping(source = "id.mechanicId", target = "mechanicId")
    @Mapping(source = "id.serviceId", target = "serviceId")
    CanDoDTO toDto(CanDo canDo);

    @Mapping(source = "mechanicId", target = "id.mechanicId")
    @Mapping(source = "serviceId", target = "id.serviceId")
    CanDo toEntity(CanDoDTO canDoDTO);
}
