package com.rkvk.automobile.automobileshop.entity.id;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MechanicPhoneId implements Serializable {
    private Long mechanicId;
    private String phoneNo;
}