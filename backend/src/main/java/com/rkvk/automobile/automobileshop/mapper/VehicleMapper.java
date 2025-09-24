package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.VehicleDTO;
import com.rkvk.automobile.automobileshop.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);

    @Mapping(source = "customer.customerId", target = "customerId")
    VehicleDTO toDto(Vehicle vehicle);

    @Mapping(source = "customerId", target = "customer.customerId")
    Vehicle toEntity(VehicleDTO vehicleDTO);
}
