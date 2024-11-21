package com.example.projectcoffee9.controller;

import com.example.projectcoffee9.entity.Menu;
import com.example.projectcoffee9.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    // 메뉴 리스트 (상품 나열)
    @GetMapping
    public String listMenus(Model model) {
        model.addAttribute("menus", menuService.getAllMenus());
        return "menu/menu"; // menu.html로 이동
    }

    // 메뉴 상세 정보
    @GetMapping("/details/{id}")
    public String getMenuDetails(@PathVariable Long id, Model model) {
        Menu menu = menuService.getMenuById(id);
        if (menu != null) {
            model.addAttribute("menu", menu);
            return "menu/menu-details"; // menu-details.html로 이동
        }
        return "redirect:/menu"; // ID가 없으면 목록으로 리다이렉트
    }
}
