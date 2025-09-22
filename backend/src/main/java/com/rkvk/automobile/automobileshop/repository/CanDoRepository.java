package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.CanDo;
import com.rkvk.automobile.automobileshop.entity.id.CanDoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanDoRepository extends JpaRepository<CanDo, CanDoId> {
}
