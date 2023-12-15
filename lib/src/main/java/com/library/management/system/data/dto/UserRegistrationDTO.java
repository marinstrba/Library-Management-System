package com.library.management.system.data.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegistrationDTO {
    String name;
    String surname;
    String email;
    LocalDate birthday;
}
