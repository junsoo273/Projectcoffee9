package com.example.projectcoffee9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "auth/login"; // templates/auth/login.html
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "auth/signup"; // templates/auth/signup.html
    }
}
