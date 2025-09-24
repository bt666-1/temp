package com.rkvk.automobile.automobileshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceDTO {
    private Long invoiceId;
    private AppointmentDTO appointment;   // reference to appointment
    private Double taxPercentage;
    private Double labourCost;
    private Set<UsesDTO> usedParts;       // parts used in invoice
}
