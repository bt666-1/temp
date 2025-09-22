package com.rkvk.automobile.automobileshop.entity;

import com.rkvk.automobile.automobileshop.entity.id.CustomerEmailId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_emails")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(CustomerEmailId.class)
public class CustomerEmail {
    @Id
    private Long customerId;

    @Id
    private String email;
}

