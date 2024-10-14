package com.nhnacademy.accountapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
public class User {
    @Id
    private String username;
    private String email;
    private String password;

    public User() {

    }
}
