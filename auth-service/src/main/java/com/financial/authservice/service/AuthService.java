package com.financial.authservice.service;

import com.financial.authservice.dto.AuthRequestDTO;
import com.financial.userservice.dto.UserDTO;
import com.financial.userservice.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;
    }


    public UserDTO login(AuthRequestDTO dto) {

        UserDTO userDTO = userService.getUserByEmail(dto.getEmail());

        if(!(userDTO.getPasswordHash().equals(dto.getPassword()))) {
            throw new RuntimeException("Wrong password");
        }

        return userDTO;

    }


}
