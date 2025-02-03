package com.interview.controller;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MenuRequest {
    @NotBlank(message = "Menu name cannot be empty.")
    private String name;
}
