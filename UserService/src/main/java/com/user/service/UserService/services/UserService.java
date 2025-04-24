package com.user.service.UserService.services;

import com.user.service.UserService.entiry.User;

import java.util.List;

public interface UserService {

    //User Operations
    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);

    //to do delete
    //to do update

}
