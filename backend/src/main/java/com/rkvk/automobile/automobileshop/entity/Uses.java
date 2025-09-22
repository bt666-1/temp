package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.UsesId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "uses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(UsesId.class)
public class Uses {
    @Id
    private Long invoiceId;

    @Id
    private Long partId;

    private Integer count;
}
