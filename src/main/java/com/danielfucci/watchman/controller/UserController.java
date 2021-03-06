package com.danielfucci.watchman.controller;

import com.danielfucci.watchman.domain.model.User;
import com.danielfucci.watchman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = "/all")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<User> testEndpoint() {
        return userService.getAll();
    }

    @PostMapping(path = "/register")
    @ResponseStatus(HttpStatus.OK)
    public void registerUser(@RequestBody User newUser) {
        userService.register(newUser);
    }
}
