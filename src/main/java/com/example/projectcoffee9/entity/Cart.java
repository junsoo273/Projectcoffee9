package com.example.projectcoffee9.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "menu_id") // This links the cart to a specific menu
    private Menu menu;

    private int quantity; // Quantity of the menu item in the cart
}
