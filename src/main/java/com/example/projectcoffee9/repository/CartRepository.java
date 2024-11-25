package com.example.projectcoffee9.repository;

import com.example.projectcoffee9.entity.Cart;
import com.example.projectcoffee9.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    // Find a cart item by Menu (use this to check if a menu is already in the cart)
    Cart findByMenu(Menu menu);
}
