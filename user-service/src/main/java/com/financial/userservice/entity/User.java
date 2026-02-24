package com.financial.userservice.entity;

import com.financial.userservice.dto.UserRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;

    @Column(unique=true, nullable=false)
    private String email;

    private String passwordHash;

    private Role role;

    public User(UserRequestDTO userRequestDTO) {
        this.username = userRequestDTO.getUsername();
        this.email = userRequestDTO.getEmail();
        this.passwordHash = userRequestDTO.getPassword();
        this.role = userRequestDTO.getRole();
    }

    public User() {}

    public User(String email) {
        this.email = email;
    }
}
