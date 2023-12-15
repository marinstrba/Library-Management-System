package com.library.management.system.service;

import com.library.management.system.data.dto.UserDTO;
import com.library.management.system.data.entity.User;
import com.library.management.system.data.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void createUserAccount(UserDTO userDTO)
    {
        User user = User.builder()
                .name(userDTO.getName())
                .surname(userDTO.getSurname())
                .email(userDTO.getEmail())
                .age(calculateAge(userDTO.getBirthday()))
                .userCheckOuts(null)
                .build();
        userRepository.save(user);
    }

    private static Integer calculateAge(LocalDate birthDate)
    {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(currentDate, birthDate);
        return period.getYears();
    }
}
