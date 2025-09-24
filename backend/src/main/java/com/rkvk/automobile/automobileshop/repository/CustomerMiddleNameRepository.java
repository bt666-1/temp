package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.CustomerMiddleName;
import com.rkvk.automobile.automobileshop.entity.id.CustomerMiddleNameId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMiddleNameRepository extends JpaRepository<CustomerMiddleName, CustomerMiddleNameId> {
    List<CustomerMiddleName> findByIdCustomerId(Long customerId);
}
