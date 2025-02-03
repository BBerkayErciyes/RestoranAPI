package com.interview.service;

import com.interview.domain.Category;
import com.interview.expection.CategoryNotFoundException;
import com.interview.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryrepository;

    public Category insert(Category entity) {
        return categoryrepository.save(entity);
    }

    public Category update(Category entity) {
        Category existingCategory = categoryrepository.findById(entity.getId())
                .orElseThrow(() -> new CategoryNotFoundException("Category not found with ID: " + entity.getId()));
        return categoryrepository.save(entity);
    }
    public List<Category> getAll() {
        return (List<Category>) categoryrepository.findAll();
    }
    public Category getById(UUID id) {
        return categoryrepository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Category not found with ID: " + id));
    }

    public void deleteById(UUID id) {
        Category category = categoryrepository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Category not found with ID: " + id));
        categoryrepository.delete(category);
    }
    public List<Category> CategoryByMenu(UUID category_id) {
        return categoryrepository.findByMenuId(category_id);
    }
    public List<Category> search(String name) {
        return categoryrepository.findByNameContains(name);
    }
}
