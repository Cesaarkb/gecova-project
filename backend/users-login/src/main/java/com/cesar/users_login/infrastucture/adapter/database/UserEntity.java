package com.cesar.users_login.infrastucture.adapter.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class UserEntity {

    @Id
    private Long id;    
    private String username;
    @Column(name="password_hashed")
    private String passwordHashed;
}
