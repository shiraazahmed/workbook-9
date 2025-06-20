package com.pluralsight.demo.api.Dao;

import com.pluralsight.demo.api.models.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int productId);
}
