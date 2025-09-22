package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.RequiredId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "required")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Required {

    @EmbeddedId
    private RequiredId id;

    @ManyToOne
    @MapsId("invoiceId")
    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
    private Invoice invoice;

    @ManyToOne
    @MapsId("mechanicId")
    @JoinColumn(name = "mechanic_id", referencedColumnName = "mechanic_id")
    private Mechanic mechanic;

    @Column(name = "description")
    private String description;
}

