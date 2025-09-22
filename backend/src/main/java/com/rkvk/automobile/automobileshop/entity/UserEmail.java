package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.UserEmailId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_emails")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(UserEmailId.class)
public class UserEmail {

    @Id
    private Long userId;

    @Id
    private String email;
}
