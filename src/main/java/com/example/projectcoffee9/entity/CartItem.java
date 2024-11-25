package com.example.projectcoffee9.entity;

import jakarta.persistence.*;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Menu menu;  // 장바구니에 담긴 메뉴

    private int quantity; // 메뉴의 수량

    // 기본 생성자, Getter, Setter
    public CartItem() {}

    public CartItem(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
