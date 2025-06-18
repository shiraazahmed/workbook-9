package com.pluralsight.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductsController {
    @GetMapping("/products")
    public List<String> getAllProducts() {
        return Arrays.asList("Iphone 14", "Airpods Pro", "Macbook Pro");
    }
}
