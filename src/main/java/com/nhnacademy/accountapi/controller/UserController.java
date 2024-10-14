package com.nhnacademy.accountapi.controller;

import com.nhnacademy.accountapi.domain.User;
import com.nhnacademy.accountapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    //유저 저장
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User user1 = userService.putUser(user);
        return ResponseEntity.ok(user1);
    }
}
