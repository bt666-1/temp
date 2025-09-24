package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.MechanicPhoneDTO;
import com.rkvk.automobile.automobileshop.entity.MechanicPhone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MechanicPhoneMapper {

    MechanicPhoneMapper INSTANCE = Mappers.getMapper(MechanicPhoneMapper.class);

    @Mapping(source = "id.mechanicId", target = "mechanicId")
    @Mapping(source = "id.phone", target = "phone")
    MechanicPhoneDTO toDto(MechanicPhone mechanicPhone);

    @Mapping(source = "mechanicId", target = "id.mechanicId")
    @Mapping(source = "phone", target = "id.phone")
    MechanicPhone toEntity(MechanicPhoneDTO mechanicPhoneDTO);
}
