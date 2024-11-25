package com.example.projectcoffee9.service;

import com.example.projectcoffee9.entity.Bean;
import com.example.projectcoffee9.repository.BeanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeanService {

    private final BeanRepository beanRepository;

    public BeanService(BeanRepository beanRepository) {
        this.beanRepository = beanRepository;
    }

    // 모든 원두 목록 가져오기
    public List<Bean> getAllBeans() {
        return beanRepository.findAll();
    }

    // 특정 원두 가져오기 (ID 기준)
    public Bean getBeanById(Long id) {
        Optional<Bean> bean = beanRepository.findById(id);
        return bean.orElse(null);
    }

    // 새 원두 저장 또는 수정
    public void saveBean(Bean bean) {
        beanRepository.save(bean);
    }

    // 원두 삭제
    public void deleteBean(Long id) {
        beanRepository.deleteById(id);
    }
}
