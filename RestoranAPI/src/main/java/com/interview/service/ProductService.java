package com.interview.service;

import com.interview.domain.Category;
import com.interview.domain.Menu;
import com.interview.domain.Product;
import com.interview.expection.CategoryNotFoundException;
import com.interview.expection.MenuNotFoundException;
import com.interview.expection.ProductNotFoundException;
import com.interview.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public Product insert(Product entity) {
        return productRepository.save(entity);
    }

    public Product update(Product entity) {
        Product existingCategory = productRepository.findById(entity.getId())
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + entity.getId()));
        return productRepository.save(entity);
    }
    public void deleteById(UUID id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + id));
        productRepository.delete(product);
    }
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }
    public List<Product> findByCategoryId(UUID id) {

    return productRepository.findByCategoryId(id);}
    public Product getById(UUID id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + id));
    }
    public List<Product> search(String name) {
        return productRepository.findByNameContains(name);
    }

}
