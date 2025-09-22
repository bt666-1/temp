package com.rkvk.automobile.automobileshop.entity.id;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MechanicMiddleNameId implements Serializable {
    private Long mechanicId;
    private String middleName;
}
