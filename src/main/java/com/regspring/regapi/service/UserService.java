package com.regspring.regapi.service;

import com.regspring.regapi.entity.UserEntity;
import com.regspring.regapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // findAll(): Fetch all entities.
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
    // save(): Save or update an entity.
    public UserEntity setUser(UserEntity user) {
        return userRepository.save(user);
    }

    // findById(): Find an entity by its primary key.

    // deleteById(): Delete an entity by its primary key.
}
