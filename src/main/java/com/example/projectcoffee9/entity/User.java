package com.example.projectcoffee9.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;   // 사용자 이름
    private String password;   // 비밀번호
    private String name;       // 이름
    private String contact;    // 연락처
    private String birthdate;  // 생일
    private String gender;     // 성별
    private String email;      // 이메일
}
