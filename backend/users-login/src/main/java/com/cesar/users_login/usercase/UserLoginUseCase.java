package com.cesar.users_login.usercase;

import com.cesar.users_login.domain.model.User;
import com.cesar.users_login.domain.port.PasswordHasher;
import com.cesar.users_login.domain.port.TokenGenerator;
import com.cesar.users_login.domain.port.UserRepository;

public class UserLoginUseCase {

private final UserRepository userRepository;
private final PasswordHasher passwordHasher;
private final TokenGenerator tokenGenerator;

public UserLoginUseCase(UserRepository userRepository,
                        PasswordHasher passwordHasher,
                        TokenGenerator tokenGenerator){
    this.passwordHasher = passwordHasher;
    this.userRepository = userRepository;
    this.tokenGenerator = tokenGenerator;
                        }

public String login(String username, String rawPassword){
    User user = userRepository.findByUsername(username)
    //mejorar la implementacion con una exception personalizada
    .orElseThrow(()-> new RuntimeException("Credenciales inválidas"));

    if(!passwordHasher.verify(rawPassword, user.getPassword())){
        throw new RuntimeException("Credenciales inválidas");
    }

    return tokenGenerator.generateToken(user);
}


}
