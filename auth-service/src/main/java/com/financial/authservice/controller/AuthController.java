package com.financial.authservice.controller;

import com.financial.authservice.dto.AuthRequestDTO;
import com.financial.authservice.service.AuthService;
import com.financial.authservice.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public UserDTO login(@RequestBody AuthRequestDTO authRequestDTO) {

        return authService.login(authRequestDTO);

    }
}
