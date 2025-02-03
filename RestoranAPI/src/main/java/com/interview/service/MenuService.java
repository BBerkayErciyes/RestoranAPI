package com.interview.service;

import com.interview.domain.Menu;
import com.interview.domain.Product;
import com.interview.expection.CategoryNotFoundException;
import com.interview.expection.MenuNotFoundException;
import com.interview.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menurepository;

    public Menu insert(Menu entity) {
        return menurepository.save(entity);
    }

    public Menu update(Menu entity) {
        Menu existingCategory = menurepository.findById(entity.getId())
                .orElseThrow(() -> new CategoryNotFoundException("Menu not found with ID: " + entity.getId()));
        return menurepository.save(entity);
    }
    public List<Menu> getAll() {
        return (List<Menu>) menurepository.findAll();
    }
    public Menu getById(UUID id) {
        return menurepository.findById(id)
                .orElseThrow(() -> new MenuNotFoundException("Menu not found with ID: " + id));
    }
    public void deleteById(UUID id) {
        Menu menu = menurepository.findById(id)
                .orElseThrow(() -> new MenuNotFoundException("Menu not found with ID: " + id));
        menurepository.delete(menu);
    }
    public List<Menu> search(String name) {
        return menurepository.findByNameContains(name);  // DOĞRU
    }
}
