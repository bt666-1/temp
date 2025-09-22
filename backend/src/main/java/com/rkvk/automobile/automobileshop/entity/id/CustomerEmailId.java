package com.rkvk.automobile.automobileshop.entity.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEmailId implements java.io.Serializable {
    private Long customerId;
    private String email;
}
