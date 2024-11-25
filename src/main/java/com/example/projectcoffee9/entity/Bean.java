package com.example.projectcoffee9.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;         // 원두 이름
    private String description;  // 설명
    private Double price;        // 가격
    private String imageUrl;     // 이미지 경로
    private String category;     // 카테고리
}
