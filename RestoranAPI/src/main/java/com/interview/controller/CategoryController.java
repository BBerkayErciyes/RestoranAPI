package com.interview.controller;

import com.interview.domain.Category;
import com.interview.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getall")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @PostMapping("/insert")
    public Category insert(@Valid @RequestBody Category entity) {

        return categoryService.insert(entity);
    }
    @PostMapping("/update")
    public Category update(@RequestBody Category entity) {

        return categoryService.update(entity);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable UUID id) {
        categoryService.deleteById(id);
    }
    @GetMapping(path="/getbyid/{id}")
    public Category getByID(@PathVariable(value="id") UUID id) {
        return categoryService.getById(id);
    }
    @GetMapping(path = "/search/{name}")
    public List<Category> search(@PathVariable(value="name" ) String name) {
        return categoryService.search(name);
    }
}

