package com.user.service.UserService.controller;

import com.user.service.UserService.entiry.User;
import com.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);


    }

    //single user get
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){

        User user = userService.getUser(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }

    //multiple user get
    @GetMapping
    public ResponseEntity<List<User>> getALlUsers(){

        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);

    }
}
