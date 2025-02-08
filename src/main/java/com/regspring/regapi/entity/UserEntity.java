package com.regspring.regapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userinfo")
@Setter
@Getter
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String username;
    private String firstName;
    private String lastName;
    private String userPassword;

    //public UserEntity() {}

    public UserEntity(String username, String firstName, String lastName, String userPassword) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userPassword = userPassword;
    }

}
