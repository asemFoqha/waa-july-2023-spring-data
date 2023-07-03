package com.example.demo.controller;

import com.example.demo.entity.User;

import com.example.demo.services.implementation.UserServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImplementation userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public void save(@RequestBody User user){
        userService.save(user);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody User user){
        userService.updateById(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    }
}
