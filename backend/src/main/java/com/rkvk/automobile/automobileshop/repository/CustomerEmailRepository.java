package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.CustomerEmail;
import com.rkvk.automobile.automobileshop.entity.id.CustomerEmailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerEmailRepository extends JpaRepository<CustomerEmail, CustomerEmailId> {
    List<CustomerEmail> findByCustomerId(Long customerId);
}
