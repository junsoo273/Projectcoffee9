package com.example.projectcoffee9.repository;

import com.example.projectcoffee9.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByCategory(String category); // 카테고리별 조회
}
