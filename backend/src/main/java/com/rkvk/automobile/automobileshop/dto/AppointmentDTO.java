package com.rkvk.automobile.automobileshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentDTO {

    private Long appointmentId;

    private UserDTO user;
    private VehicleDTO vehicle;
    private ServiceEntityDTO service;

    private String date;
    private String time;
    private LocalDateTime createdAt;
}
