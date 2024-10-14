package com.nhnacademy.accountapi.service;

import com.nhnacademy.accountapi.domain.User;
import com.nhnacademy.accountapi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User putUser(User user) {
        return userRepository.save(user);
    }
}
