package com.financial.userservice.controller;

import com.financial.userservice.dto.UserRequestDTO;
import com.financial.userservice.dto.UserResponseDTO;
import com.financial.userservice.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserResponseDTO registerUser(@RequestBody UserRequestDTO userRequestDTO) {

        UserResponseDTO userResponseDTO = userService.registerUser(userRequestDTO);

        userResponseDTO.setMessage("success");

        return userResponseDTO;

    }
}
