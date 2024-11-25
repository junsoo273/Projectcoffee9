package com.example.projectcoffee9.repository;

import com.example.projectcoffee9.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 사용자 이름으로 사용자 찾기
    User findByUsername(String username);
}
