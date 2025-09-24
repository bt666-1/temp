package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.AppointmentDTO;
import com.rkvk.automobile.automobileshop.entity.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = { UserMapper.class, VehicleMapper.class, ServiceEntityMapper.class })
public interface AppointmentMapper {

    AppointmentMapper INSTANCE = Mappers.getMapper(AppointmentMapper.class);

    AppointmentDTO toDto(Appointment appointment);

    Appointment toEntity(AppointmentDTO appointmentDTO);
}
