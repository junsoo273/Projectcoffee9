package com.example.projectcoffee9.repository;

import com.example.projectcoffee9.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
