package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.MechanicMiddleNameId;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "mechanic_middle_name")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MechanicMiddleName {

    @EmbeddedId
    private MechanicMiddleNameId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("mechanicId")
    @JoinColumn(name = "mechanic_id", referencedColumnName = "mechanic_id", nullable = false)
    private Mechanic mechanic;

    @Column(name = "middle_name_order")
    private int middleNameOrder;
}
