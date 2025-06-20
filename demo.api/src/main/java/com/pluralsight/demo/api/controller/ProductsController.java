package com.pluralsight.demo.api.controller;

import com.pluralsight.demo.api.Dao.ProductDao;
import com.pluralsight.demo.api.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductsController {
    private final ProductDao productDao;
    public ProductsController(ProductDao productDao) {
        this.productDao = productDao;
    }
    @GetMapping("/products")
    public List<String> getAllProducts() {
        return Arrays.asList("Iphone 14", "Airpods Pro", "Macbook Pro");
    }
    @GetMapping ("/{id}")
    public Product getProductById(int id) {
        return productDao.getById(id);
    }
}
