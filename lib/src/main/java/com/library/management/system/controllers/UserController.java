package com.library.management.system.controllers;

import com.library.management.system.data.dto.*;
import com.library.management.system.data.entity.CheckOut;
import com.library.management.system.data.entity.User;
import com.library.management.system.errors.UserNotFoundException;
import com.library.management.system.service.CheckOutService;
import com.library.management.system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final CheckOutService checkOutService;

    @PostMapping(value = "/create-account")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        userService.createUserAccount(userRegistrationDTO);
    }

    @GetMapping(value = "/users")
    public List<UserPublicDTO> getAllUsersInfo() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/user-info/{id}")
    public User getUserProfileInfo(@PathVariable Integer Id) {
        User user = userService.getUserInfo(Id);
        if (user != null)
            return user;
        else
            throw new UserNotFoundException("User not found.");
    }
}
