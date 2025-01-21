package com.regspring.regapi.service;

import com.regspring.regapi.entity.UserEntity;
import com.regspring.regapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
//    save(): Save or update an entity.
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
//    findById(): Find an entity by its primary key.
//    findAll(): Fetch all ent ities.
//    deleteById(): Delete an entity by its primary key.
}
