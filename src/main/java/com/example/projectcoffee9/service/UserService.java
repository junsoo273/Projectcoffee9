package com.example.projectcoffee9.service;

import com.example.projectcoffee9.entity.User;
import com.example.projectcoffee9.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user); // 사용자 정보 저장
    }

    // 사용자 이름으로 찾기 (로그인에 사용)
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
