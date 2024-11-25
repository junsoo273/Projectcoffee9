package com.example.projectcoffee9.controller;

import com.example.projectcoffee9.entity.Menu;
import com.example.projectcoffee9.service.CartService;
import com.example.projectcoffee9.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;
    private final MenuService menuService;

    public CartController(CartService cartService, MenuService menuService) {
        this.cartService = cartService;
        this.menuService = menuService;
    }

    // 장바구니 페이지
    @GetMapping
    public String viewCart(Model model) {
        model.addAttribute("cartItems", cartService.getCartItems()); // 장바구니 아이템들 가져오기
        return "cart/viewCart"; // cart/viewCart.html로 이동
    }

    // 메뉴를 장바구니에 추가
    @PostMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @RequestParam int quantity) {
        Menu menu = menuService.getMenuById(id);
        cartService.addToCart(menu, quantity); // 장바구니에 아이템 추가
        return "redirect:/cart"; // 장바구니 페이지로 리디렉션
    }

    // 장바구니에서 아이템 삭제
    @GetMapping("/remove/{id}")
    public String removeFromCart(@PathVariable Long id) {
        cartService.removeFromCart(id); // 장바구니에서 아이템 삭제
        return "redirect:/cart"; // 장바구니 페이지로 리디렉션
    }
}
