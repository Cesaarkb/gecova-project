package com.cesar.users_login.infrastucture.adapter.security;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

import com.cesar.users_login.domain.port.PasswordHasher;

@Component
public class BcryptPasswordHasher implements PasswordHasher{

    @Override
    public boolean verify(String rawPassword, String hashedPassword) {
        if(rawPassword==null || hashedPassword == null){
            return false;
        }
            return BCrypt.checkpw(rawPassword, hashedPassword);

    }

    public String hash(String rawPassword) {
        return BCrypt.hashpw(rawPassword, BCrypt.gensalt());
    }


}
