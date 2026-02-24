package com.financial.userservice.controller;

import com.financial.userservice.dto.UserDTO;
import com.financial.userservice.dto.UserLoginDTO;
import com.financial.userservice.dto.UserRequestDTO;
import com.financial.userservice.dto.UserResponseDTO;
import com.financial.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/email/{email}")
    public UserDTO login(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }


}
