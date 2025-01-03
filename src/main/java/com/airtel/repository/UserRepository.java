package com.airtel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airtel.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
