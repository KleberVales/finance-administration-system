package com.financial.userservice.service;

import com.financial.userservice.dto.UserDTO;
import com.financial.userservice.dto.UserLoginDTO;
import com.financial.userservice.dto.UserRequestDTO;
import com.financial.userservice.dto.UserResponseDTO;
import com.financial.userservice.entity.User;
import com.financial.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public UserDTO getUserByEmail(String email) {


        Optional<User> user = userRepository.findByEmail(email);

        UserDTO userDTO = new UserDTO();

        userDTO.setUsername(user.get().getUsername());
        userDTO.setEmail(user.get().getEmail());
        userDTO.setPasswordHash(user.get().getPasswordHash());

        return userDTO;




    }



}
