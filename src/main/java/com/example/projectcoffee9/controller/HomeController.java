package com.example.projectcoffee9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // 기본 루트 요청 처리
    public String showHomePage() {
        return "index"; // templates/index.html로 이동
    }
}
