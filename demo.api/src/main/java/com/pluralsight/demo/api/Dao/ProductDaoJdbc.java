package com.pluralsight.demo.api.Dao;

import com.pluralsight.demo.api.models.Product;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class ProductDaoJdbc implements ProductDao {
    private final DataSource dataSource;

    public ProductDaoJdbc(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public List<Product> getAll() {
        return null;
    }
    @Override
    public Product getById(int id) {
        return null;
    }
}
