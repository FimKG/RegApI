package com.regspring.regapi.service;

import com.regspring.regapi.entity.UserEntity;
import com.regspring.regapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service class for managing user-related operations.
 * Handles business logic for user operations.
 * This class provides methods to interact with the user repository,
 * including saving, retrieving, and processing user data.
 */
@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    /**
     * Constructor to initialize the UserService with a UserRepository.
     *
     * @param userRepository the repository used to perform user-related database operations.
     */

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    /**
     * Retrieves a list of all users from the database.
     * findAll(): Fetch all entities.
     *
     * @return a list of UserEntity objects representing all users.
     */
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Saves a new user to the database.
     * setUser(): Save an entity.
     *
     * @param user the UserEntity object containing user details.
     * @return the saved UserEntity object.
     */
    public UserEntity setUser(UserEntity user) {
        return userRepository.save(user);
    }

    // findById(): Find an entity by its primary key.

    // deleteById(): Delete an entity by its primary key.
}
