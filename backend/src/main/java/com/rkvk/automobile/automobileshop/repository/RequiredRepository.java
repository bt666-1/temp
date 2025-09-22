package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.Required;
import com.rkvk.automobile.automobileshop.entity.id.RequiredId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequiredRepository extends JpaRepository<Required, RequiredId> {
}
