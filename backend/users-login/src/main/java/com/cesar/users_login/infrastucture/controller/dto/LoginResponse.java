package com.cesar.users_login.infrastucture.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginResponse {
private String token;

    public LoginResponse(String token) {
        this.token = token;
    }
}
