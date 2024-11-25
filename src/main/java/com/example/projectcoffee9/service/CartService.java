package com.example.projectcoffee9.service;

import com.example.projectcoffee9.entity.CartItem;
import com.example.projectcoffee9.entity.Menu;
import com.example.projectcoffee9.repository.CartItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartItemRepository cartItemRepository;

    public CartService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    // 장바구니에 추가
    public void addToCart(Menu menu, int quantity) {
        CartItem cartItem = new CartItem(menu, quantity);
        cartItemRepository.save(cartItem); // 장바구니에 아이템 추가
    }

    // 장바구니 목록 가져오기
    public List<CartItem> getCartItems() {
        return cartItemRepository.findAll();
    }

    // 장바구니에서 아이템 삭제
    public void removeFromCart(Long id) {
        cartItemRepository.deleteById(id); // 아이템 삭제
    }
}
