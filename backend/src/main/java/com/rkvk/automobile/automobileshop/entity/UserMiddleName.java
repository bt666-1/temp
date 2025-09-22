package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.UserMiddleNameId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_middle_names")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(UserMiddleNameId.class)
public class UserMiddleName {

    @Id
    private Long userId;

    @Id
    private String middleName;

    private int middleNameOrder;
}