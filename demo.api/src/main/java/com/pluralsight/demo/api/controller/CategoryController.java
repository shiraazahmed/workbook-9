package com.pluralsight.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CategoryController {
    @GetMapping ("/categories")
    public List<String> getAllCategories() {
        return Arrays.asList("Phones", "Headphones", "Laptops");
    }

}
