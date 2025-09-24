package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.MechanicMiddleNameDTO;
import com.rkvk.automobile.automobileshop.entity.MechanicMiddleName;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MechanicMiddleNameMapper {

    MechanicMiddleNameMapper INSTANCE = Mappers.getMapper(MechanicMiddleNameMapper.class);

    @Mapping(source = "id.mechanicId", target = "mechanicId")
    @Mapping(source = "id.middleName", target = "middleName")
    @Mapping(source = "middleNameOrder", target = "middleNameOrder")
    MechanicMiddleNameDTO toDto(MechanicMiddleName mechanicMiddleName);

    @Mapping(source = "mechanicId", target = "id.mechanicId")
    @Mapping(source = "middleName", target = "id.middleName")
    @Mapping(source = "middleNameOrder", target = "middleNameOrder")
    MechanicMiddleName toEntity(MechanicMiddleNameDTO mechanicMiddleNameDTO);
}
