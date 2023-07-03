package com.example.demo.services.implementation;

import com.example.demo.entity.User;
import com.example.demo.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void updateById(Long id, User user) {

    }

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
