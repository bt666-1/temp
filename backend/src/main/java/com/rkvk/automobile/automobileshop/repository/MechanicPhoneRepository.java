package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.MechanicPhone;
import com.rkvk.automobile.automobileshop.entity.id.MechanicPhoneId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicPhoneRepository extends JpaRepository<MechanicPhone, MechanicPhoneId> {
}
