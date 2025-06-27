package com.kp.springboot_jpa_01.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kp.springboot_jpa_01.model.UserEntity;
import com.kp.springboot_jpa_01.services.UserService;

@RestController  
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Create user
    @PostMapping("/add")
    public String saveUser(@RequestBody UserEntity user) {
        userService.saveUser(user);
        return "User added successfully!";
    }

    // Update user
    @PutMapping("/update")
    public String updateUser(@RequestBody UserEntity user) {
        userService.updateUser(user);
        return "User updated successfully!";
    }

    // Delete user by ID
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "User deleted successfully!";
    }

    // Get single user by ID
    @GetMapping("/{id}")
    public Optional<UserEntity> getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    // Get all users
    @GetMapping("/all")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }
}


