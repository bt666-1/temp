package com.rkvk.automobile.automobileshop.entity.id;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMiddleNameId implements Serializable {
    private Long userId;
    private String middleName;
}
