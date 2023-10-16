package com.codeclan.projectHere.controllers;
import com.codeclan.projectHere.models.Establishment;
import com.codeclan.projectHere.models.User;
import com.codeclan.projectHere.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/users/{id}/checked_ins")
    public List<Establishment> getAllCheckedIns(@PathVariable Long id) { return userRepository.findAllCheckedInsById(id); }

}
