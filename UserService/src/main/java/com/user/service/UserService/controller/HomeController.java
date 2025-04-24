package com.user.service.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String homeControllerDisplay(){
        return "Hello World";
    }
}
