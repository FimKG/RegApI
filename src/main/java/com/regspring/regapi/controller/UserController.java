package com.regspring.regapi.controller;

import com.regspring.regapi.entity.UserEntity;
import com.regspring.regapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class to handle user-related API endpoints.
 * Provides endpoints for retrieving and managing user data.
 * Exposes RESTful APIs for user operations.
 * REST APIs
 * JSON or XML
 *
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
// @GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Shortcut annotations for specific HTTP methods.

    /**
     * Field injection (@Autowired on field)
     */
    @Autowired
    UserService userService;

    // Endpoint to All users retrieve
    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    // Endpoint to create a User
    @PostMapping("/setUser")
    public UserEntity setUser(@RequestBody UserEntity user) {
        return userService.setOrUpdateUser(user);
    }

    // Endpoint to update
    @PutMapping("/updateUser")
    public String updateUser(@RequestBody UserEntity user) {
        if (userService.updateUser(user)) {
            return "User updated successfully.";
        }
        return "User not found.";
    }

    // Endpoint to delete
    @DeleteMapping("/deleteUse/{userId}")
    public String deleteUserId(@PathVariable String userId) {
        //return userService.deleteUser(userId)  ? "User delete successfully." : "Unable to delete User";
        if(userService.deleteUserId(userId)) {
            return "User deleted successfully.";
        }
        return "Unable to delete User.";
    }

}
