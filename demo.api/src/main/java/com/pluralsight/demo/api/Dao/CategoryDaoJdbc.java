package com.pluralsight.demo.api.Dao;

import com.pluralsight.demo.api.models.Category;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class CategoryDaoJdbc implements CategoryDao {
    private final DataSource dataSource;

    public CategoryDaoJdbc(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
    @Override
    public Category getById(int id) {
        return null;
    }
}
