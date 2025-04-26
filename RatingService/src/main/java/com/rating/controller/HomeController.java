package com.rating.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public String homeController() {
        return "Hello World";
    }
}
