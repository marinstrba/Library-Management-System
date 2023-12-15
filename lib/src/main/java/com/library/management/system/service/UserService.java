package com.library.management.system.service;

import com.library.management.system.data.dto.UserDTO;
import com.library.management.system.data.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void createUserAccount(UserDTO userDTO)
    {

    }

}
