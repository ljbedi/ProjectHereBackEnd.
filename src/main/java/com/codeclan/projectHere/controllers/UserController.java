package com.codeclan.projectHere.controllers;
import com.codeclan.projectHere.models.User;
import com.codeclan.projectHere.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> getAllUsers() {
    return userRepository.findAll();
    }

    @PostMapping(value = "/users")
    public User createNewUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
