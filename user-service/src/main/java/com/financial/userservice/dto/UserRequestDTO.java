package com.financial.userservice.dto;

import com.financial.userservice.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {

    private String username;
    private String email;
    private String password;
    private Role role;

}
