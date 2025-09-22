package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.MechanicMiddleName;
import com.rkvk.automobile.automobileshop.entity.id.MechanicMiddleNameId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicMiddleNameRepository extends JpaRepository<MechanicMiddleName, MechanicMiddleNameId> {
}
