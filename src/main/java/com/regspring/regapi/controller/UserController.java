package com.regspring.regapi.controller;

import com.regspring.regapi.entity.UserEntity;
import com.regspring.regapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// REST APIs
// JSON or XML
@RestController
@RequestMapping("/api/users")
public class UserController {
// @GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Shortcut annotations for specific HTTP methods.

    private final UserRepository userRepository;
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Endpoint to retrieve
    @GetMapping("/getUser")
    public String getUser() {
        return "Retrieve User Details";
    }

    // Endpoint to create User
    @PostMapping("/setUser")
    public UserEntity setUser(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    // Endpoint to retrieve
}
