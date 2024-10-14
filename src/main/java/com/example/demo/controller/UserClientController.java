package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class UserClientController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String serverUrl = "http://localhost:8080/users";

    public User addUserInfo(User user) {
        //Http 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        //요청 본문 설정
        HttpEntity<User> request = new HttpEntity<>(user, headers);

        //POST 요청 보내기
        ResponseEntity<User> response = restTemplate.exchange(serverUrl, HttpMethod.POST, request, User.class);

        //성공적으로 처리되었을 때 응답 확인
        if (response.getStatusCode() == HttpStatus.CREATED) {
            return response.getBody();
        } else {
            throw new RuntimeException("Error creating user");
        }
    }

    public static void main(String[] args) {
        UserClientController client = new UserClientController();
        User newUser = new User("Alice", "alice@gmail.com", "pwd12");

        User addedUser = client.addUserInfo(newUser);
        System.out.println("added user: " + addedUser);
    }
}
