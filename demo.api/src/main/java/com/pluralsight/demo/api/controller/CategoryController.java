package com.pluralsight.demo.api.controller;

import com.pluralsight.demo.api.Dao.CategoryDao;
import com.pluralsight.demo.api.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CategoryController {
    private final CategoryDao categoryDao;
    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
    @GetMapping ("/categories")
    public List<String> getAllCategories() {
        return Arrays.asList("Phones", "Headphones", "Laptops");
    }
    @GetMapping ("/{id}")
    public Category getCategoryById(int id) {
        return categoryDao.getById(id);
    }

}
