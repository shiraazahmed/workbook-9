package com.pluralsight.demo.api.controller;

import com.pluralsight.demo.api.Dao.CategoryDao;
import com.pluralsight.demo.api.Dao.ProductDao;
import com.pluralsight.demo.api.models.Category;
import com.pluralsight.demo.api.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
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

        @RequestMapping(method = RequestMethod.POST)
                @ResponseStatus(HttpStatus.CREATED)
        public Product createProduct(@RequestBody Product product) throws SQLException {
            return productDao.insert(product);
        }
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Category createCategory(@RequestBody Category category) throws SQLException {
        return CategoryDao.insert(category);
    }

}
