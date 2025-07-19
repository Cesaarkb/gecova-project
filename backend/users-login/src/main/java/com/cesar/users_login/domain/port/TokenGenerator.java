package com.cesar.users_login.domain.port;

import com.cesar.users_login.domain.model.User;

public interface TokenGenerator {

    String generateToken(User user);
}
