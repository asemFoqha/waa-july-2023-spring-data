package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.services.implementation.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImplementation userService;

    @PostMapping
    public void saveUser(@RequestBody User user) {

        userService.saveUser(user);

    }


}
