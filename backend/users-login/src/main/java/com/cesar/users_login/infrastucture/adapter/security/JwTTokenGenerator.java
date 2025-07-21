package com.cesar.users_login.infrastucture.adapter.security;   

import java.util.Date;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.cesar.users_login.domain.model.User;
import com.cesar.users_login.domain.port.TokenGenerator;
import com.cesar.users_login.infrastucture.config.JwtProperties;

@Component
public class JwTTokenGenerator implements TokenGenerator{

    private final JwtProperties jwtProperties;

    public JwTTokenGenerator(JwtProperties jwtProperties){
        this.jwtProperties = jwtProperties;
    }

    @Override
    public String generateToken(User user) {
        Algorithm algorithm = Algorithm.HMAC256(jwtProperties.getSecretKey());

        return JWT.create()
                .withSubject(user.getUsername())
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + jwtProperties.getExpirationMS()))
                .sign(algorithm);
        
    }

}
