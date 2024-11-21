package com.example.projectcoffee9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // login.html 반환
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // signup.html 반환
    }
}
