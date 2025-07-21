package com.cesar.users_login.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


/*
 * clase que representa nuestro nucleo para poder hacer login
 * contiene las anotaciones de Lombok
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
}
