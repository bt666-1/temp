package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.MechanicPhoneId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mechanic_phones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(MechanicPhoneId.class)
public class MechanicPhone {

    @Id
    private Long mechanicId;

    @Id
    private String phoneNo;
}
