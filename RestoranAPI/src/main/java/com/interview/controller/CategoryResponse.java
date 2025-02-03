package com.interview.controller;

import com.interview.domain.Category;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Data
public class CategoryResponse {

    private UUID id;
    private String name;
    private String menuName;

    public CategoryResponse(Category category) {
        this.id = category.getId();
        this.name = category.getName();
        this.menuName = category.getMenu().getName();
    }
}
