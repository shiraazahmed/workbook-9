package com.pluralsight.demo.api.Dao;

import com.pluralsight.demo.api.models.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int productId);
    Product insert(Product product) throws SQLException;
}
