package com.library.management.system.service;

import com.library.management.system.data.dto.UserPublicDTO;
import com.library.management.system.data.dto.UserRegistrationDTO;
import com.library.management.system.data.entity.User;
import com.library.management.system.data.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void createUserAccount(UserRegistrationDTO userRegistrationDTO)
    {
        User user = User.builder()
                .name(userRegistrationDTO.getName())
                .surname(userRegistrationDTO.getSurname())
                .email(userRegistrationDTO.getEmail())
                .age(calculateAge(userRegistrationDTO.getBirthday()))
                .userCheckOuts(null)
                .build();
        userRepository.save(user);
    }
    public List<UserPublicDTO> getAllUsers()
    {
        return userRepository.findAll().stream().map(user -> {
            return UserPublicDTO.builder()
                    .name(user.getName())
                    .surname(user.getSurname())
                    .email(user.getEmail())
                    .isActive(true)
                    .build();
        }).collect(Collectors.toList());
    }

    public User getUserInfo(Integer Id)
    {
        User user = new
        return userRepository.findById(Id);
    }

    private static Integer calculateAge(LocalDate birthDate)
    {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(currentDate, birthDate);
        return period.getYears();
    }
}
