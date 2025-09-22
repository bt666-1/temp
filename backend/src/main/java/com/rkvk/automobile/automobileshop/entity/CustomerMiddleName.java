package com.rkvk.automobile.automobileshop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.rkvk.automobile.automobileshop.entity.id.CustomerMiddleNameId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_middle_names")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerMiddleName {

    // Composite primary key
    @EmbeddedId
    private CustomerMiddleNameId id;

    // Extra attribute
    private int middleNameOrder;

    // Foreign key to Customer
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("customerId")
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonBackReference
    private Customer customer;
}
