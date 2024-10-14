package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/submitUser")
    public String submitUser(@RequestBody User user) {
        // user 정보를 받아 처리
        System.out.println("User received: " + user);
        return "User data submitted successfully!";
    }
}