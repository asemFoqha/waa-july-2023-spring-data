package com.example.demo.services;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void updateById(Long id, User user);

    void save(User user);

    void deleteById(Long id);
}
