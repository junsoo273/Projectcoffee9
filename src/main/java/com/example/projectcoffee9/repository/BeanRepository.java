package com.example.projectcoffee9.repository;

import com.example.projectcoffee9.entity.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeanRepository extends JpaRepository<Bean, Long> {
    // 특정 카테고리별 원두 리스트 조회
    List<Bean> findByCategory(String category);
}
