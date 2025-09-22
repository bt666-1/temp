package com.rkvk.automobile.automobileshop.entity.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequiredId implements java.io.Serializable {
    private Long invoiceId;
    private Long mechanicId;
}
