package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.MechanicDTO;
import com.rkvk.automobile.automobileshop.entity.Mechanic;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MechanicMapper {

    MechanicMapper INSTANCE = Mappers.getMapper(MechanicMapper.class);

    MechanicDTO toDto(Mechanic mechanic);

    Mechanic toEntity(MechanicDTO mechanicDTO);
}
