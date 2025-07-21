package com.cesar.users_login.infrastucture.adapter.database;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.cesar.users_login.domain.model.User;
import com.cesar.users_login.domain.port.UserRepository;

@Component
public class JpaUserRepositoryAdapter implements UserRepository{

    private final JpaUserRepository jpaUserRepository;

    public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository){
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return jpaUserRepository.findByUsername(username)
        .map(this::toDomain);
    }

    private User toDomain(UserEntity entity) {
        return new User(entity.getId(),entity.getUsername(), entity.getPasswordHashed());
    }

}
