package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.CanDoId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "can_do")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(CanDoId.class)
public class CanDo {
    @Id
    private Long mechanicId;

    @Id
    private Long serviceId;
}

