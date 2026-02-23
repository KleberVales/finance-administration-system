package com.financial.userservice.service;

import com.financial.userservice.dto.UserRequestDTO;
import com.financial.userservice.dto.UserResponseDTO;
import com.financial.userservice.entity.User;
import com.financial.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO registerUser(UserRequestDTO userRequestDTO) {

        User user = new User(userRequestDTO);

        userRepository.save(user);
        return new UserResponseDTO();

    }



}
