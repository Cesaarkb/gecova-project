package com.cesar.users_login.domain.port;


/*Interfaz que define un único método para verificar si una contraseña en texto plano
 * coincide con una contraseña previamente hasheada.*/
public interface PasswordHasher {

    boolean verify(String rawPassword, String hashedPassword);
}
