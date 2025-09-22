package com.rkvk.automobile.automobileshop.entity.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMiddleNameId implements java.io.Serializable {
    private Long customerId;
    private String middleName;
}
