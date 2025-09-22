package com.rkvk.automobile.automobileshop.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEmailId implements Serializable {
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "email")
    private String email;
}
