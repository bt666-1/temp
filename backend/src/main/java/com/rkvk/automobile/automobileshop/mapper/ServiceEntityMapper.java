package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.ServiceEntityDTO;
import com.rkvk.automobile.automobileshop.entity.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ServiceEntityMapper {

    ServiceEntityMapper INSTANCE = Mappers.getMapper(ServiceEntityMapper.class);

    ServiceEntityDTO toDto(ServiceEntity serviceEntity);

    ServiceEntity toEntity(ServiceEntityDTO serviceEntityDTO);
}
