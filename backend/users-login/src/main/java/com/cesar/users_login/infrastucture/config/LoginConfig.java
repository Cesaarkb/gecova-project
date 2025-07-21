package com.cesar.users_login.infrastucture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cesar.users_login.domain.port.PasswordHasher;
import com.cesar.users_login.domain.port.TokenGenerator;
import com.cesar.users_login.domain.port.UserRepository;
import com.cesar.users_login.usercase.UserLoginUseCase;

@Configuration
public class LoginConfig {

    @Bean
    public UserLoginUseCase uswUserLoginUseCase(
    UserRepository userRepository,
    PasswordHasher passwordHasher,
    TokenGenerator tokenGenerator
    ){
         return new UserLoginUseCase(userRepository, passwordHasher, tokenGenerator);
    }

}
