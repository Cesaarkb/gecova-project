package com.cesar.users_login.domain.port;

import java.util.Optional;

import com.cesar.users_login.domain.model.User;

public interface UserRepository {

    Optional<User> findByUsername(String username);

}
