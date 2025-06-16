package com.pluralsight.NorthwindTradersSpringBoot.ui;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public interface ProductDao {
    void addProduct(Product product);
    List<Product> getAllProducts();
}
