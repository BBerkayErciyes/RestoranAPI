package com.interview.controller;

import com.interview.domain.Category;
import com.interview.domain.Menu;
import com.interview.domain.Product;
import com.interview.service.ProductService;
import com.interview.service.CategoryService;
import com.interview.service.MenuService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Data
@RestController
@RequestMapping("/api/product")
public class ProductController {

     @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private MenuService menuService;


    @PostMapping("/insert")
    public Product insert(@Valid @RequestBody Product entity) {

        return productService.insert(entity);
    }
    @PostMapping("/update")
    public Product update(@RequestBody Product entity) {

        return productService.update(entity);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable UUID id) {
        productService.deleteById(id);
    }
    @GetMapping(path="/getbyid/{id}")
    public Product getById(@PathVariable(value="id") UUID id) {
        return productService.getById(id);
    }
    @GetMapping(path="/getall")
    public List<Product> getAll() {
        return productService.getAll();
    }
    @GetMapping(path = "/search/{name}")
    public List<Product> search(@PathVariable(name="name") String name) {
        return productService.search(name);
    }



}
