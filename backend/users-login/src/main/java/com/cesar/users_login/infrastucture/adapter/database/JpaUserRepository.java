package com.cesar.users_login.infrastucture.adapter.database;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, Long>{
    
    public Optional<UserEntity> findByUsername(String username);
    
}
