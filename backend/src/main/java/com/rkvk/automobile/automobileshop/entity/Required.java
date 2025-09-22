package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.RequiredId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
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
@IdClass(RequiredId.class)
public class Required {
    @Id
    private Long invoiceId;

    @Id
    private Long mechanicId;

    private String description;
}

