package com.rkvk.automobile.automobileshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mechanics")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mechanicId;

    private String firstName;
    private String lastName;
    private String houseNo;
    private String street;
    private String locality;
    private String city;
    private String pinCode;
}
