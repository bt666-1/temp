package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.CustomerEmail;
import com.rkvk.automobile.automobileshop.entity.id.CustomerEmailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerEmailRepository extends JpaRepository<CustomerEmail, CustomerEmailId> {

    // Query by customer ID using the embedded ID
    @Query("SELECT e FROM CustomerEmail e WHERE e.id.customerId = :customerId")
    List<CustomerEmail> findByCustomerId(@Param("customerId") Long customerId);

    List<CustomerEmail> findByIdCustomerId(Long customerId);
}
