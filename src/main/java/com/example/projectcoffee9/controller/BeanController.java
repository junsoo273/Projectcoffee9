package com.example.projectcoffee9.controller;

import com.example.projectcoffee9.entity.Bean;
import com.example.projectcoffee9.service.BeanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/beans")
public class BeanController {

    private final BeanService beanService;

    public BeanController(BeanService beanService) {
        this.beanService = beanService;
    }

    @GetMapping
    public String listBeans(Model model) {
        List<Bean> beans = beanService.getAllBeans();
        model.addAttribute("beans", beans);
        return "beans/list"; // templates/beans/list.html로 이동
    }
}
