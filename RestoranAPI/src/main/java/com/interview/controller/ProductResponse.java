package com.interview.controller;

import com.interview.domain.Product;
import lombok.Data;

import java.util.UUID;

@Data
public class ProductResponse {

    private UUID id;
    private String name;
    private Double price;
    private String description;
    private String categoryName;
    private String menuName;

    public ProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.categoryName = product.getCategory().getName();
        this.menuName = product.getMenu().getName();

        this.categoryName = product.getCategory() != null ? product.getCategory().getName() : "Category does not found!";
        this.menuName = product.getMenu() != null ? product.getMenu().getName() : "Menu does not found!";
    }
}
