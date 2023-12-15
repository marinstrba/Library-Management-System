package com.library.management.system.controllers;

import com.library.management.system.data.dto.*;
import com.library.management.system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping(value="/create-account")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UserRegistrationDTO userRegistrationDTO)
    {
        userService.createUserAccount(userRegistrationDTO);
    }
    @GetMapping(value="/users")
    public List<UserPublicDTO> getAllUsers()
    {
        return userService.getAllUsers();
    }
//    @GetMapping(value="/user-info/{id}")
//    @PostMapping(value="/order")
}
