package com.pluralsight.demo.api.Dao;

import com.pluralsight.demo.api.models.Category;

import java.sql.SQLException;
import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);
    static Category insert(Category category) throws SQLException;
}
