package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.InvoiceDTO;
import com.rkvk.automobile.automobileshop.entity.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = { AppointmentMapper.class, UsesMapper.class })
public interface InvoiceMapper {

    InvoiceMapper INSTANCE = Mappers.getMapper(InvoiceMapper.class);

    InvoiceDTO toDto(Invoice invoice);

    Invoice toEntity(InvoiceDTO invoiceDTO);
}
