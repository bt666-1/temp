package com.rkvk.automobile.automobileshop.repository;

import com.rkvk.automobile.automobileshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
