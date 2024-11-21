package com.example.projectcoffee9.service;

import com.example.projectcoffee9.entity.Menu;
import com.example.projectcoffee9.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public List<Menu> getMenusByCategory(String category) {
        return menuRepository.findByCategory(category); // Repository에 추가해야 함.
    }

    public Menu getMenuById(Long id) {
        Optional<Menu> menu = menuRepository.findById(id);
        return menu.orElse(null);
    }

    public void saveMenu(Menu menu) {
        menuRepository.save(menu);
    }

    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }
}
