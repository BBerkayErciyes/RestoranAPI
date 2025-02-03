package com.interview.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@Data
public class CategoryRequest {

    @NotBlank(message = "Category name cannot be empty.")
    private String name;

    @NotNull(message = "Menu ID is required.")
    private UUID menuId;

}
