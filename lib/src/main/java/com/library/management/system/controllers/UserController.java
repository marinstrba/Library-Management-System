package com.library.management.system.controllers;

import com.library.management.system.data.dto.*;
import com.library.management.system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(value="/create-account")
    public void createUser(@RequestBody UserDTO userDTO)
    {
        userService.createUserAccount(userDTO);
    }
//    @GetMapping(value="/users")
//    @GetMapping(value="/user-info/{id}")
//    @PostMapping(value="/order")
}
