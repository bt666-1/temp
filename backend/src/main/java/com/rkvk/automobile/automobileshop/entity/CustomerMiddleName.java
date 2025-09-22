package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.CustomerMiddleNameId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_middle_name")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(CustomerMiddleNameId.class)
public class CustomerMiddleName {
    @Id
    private Long customerId;

    @Id
    private String middleName;

    private int middleNameOrder;
}
