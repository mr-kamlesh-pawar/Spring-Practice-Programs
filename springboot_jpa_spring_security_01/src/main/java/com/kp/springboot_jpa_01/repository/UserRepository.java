package com.kp.springboot_jpa_01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kp.springboot_jpa_01.model.UserEntity;



public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    
    UserEntity findByEmail(String email);

    @Query("select u from UserEntity u where u.email = :email")
    public UserEntity getUserEntityByEmail(@Param("email") String email);
}
