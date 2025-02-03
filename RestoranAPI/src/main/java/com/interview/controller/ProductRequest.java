package com.interview.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class ProductRequest {

    @NotBlank(message = "Product name cannot be empty.")
    private String name;

    @NotNull(message = "Price cannot be null.")
    private Double price;

    private String description;

    @NotNull(message = "Category ID cannot be null.")
    private UUID categoryId;

    @NotNull(message = "Menu ID cannot be null.")
    private UUID menuId;
}
