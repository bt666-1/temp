package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.MechanicMiddleNameId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mechanic_middle_names")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(MechanicMiddleNameId.class)
public class MechanicMiddleName {

    @Id
    private Long mechanicId;

    @Id
    private String middleName;

    private int middleNameOrder;
}
