package com.mira.cybersomm.controllers;

import com.mira.cybersomm.models.User;
import com.mira.cybersomm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin/allUsers")
    public Iterable<User> findAllUsers() {
        return userService.findUsers();
    }
}
