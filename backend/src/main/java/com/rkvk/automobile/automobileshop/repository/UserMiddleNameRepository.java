package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.UserMiddleName;
import com.rkvk.automobile.automobileshop.entity.id.UserMiddleNameId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMiddleNameRepository extends JpaRepository<UserMiddleName, UserMiddleNameId> {
}
