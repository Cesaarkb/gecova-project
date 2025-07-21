package com.cesar.users_login.infrastucture.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.users_login.infrastucture.controller.dto.LoginRequest;
import com.cesar.users_login.infrastucture.controller.dto.LoginResponse;
import com.cesar.users_login.usercase.UserLoginUseCase;


@RestController
@RequestMapping("/login")
public class LoginController {
 private final UserLoginUseCase loginUseCase;

    public LoginController(UserLoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @PostMapping
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        String token = loginUseCase.login(request.getUsername(), request.getPassword());
        return ResponseEntity.ok(new LoginResponse(token));
    }
}
