package com.pluralsight.demo.api.Dao;

import com.pluralsight.demo.api.models.Category;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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

    @Override
    public Category insert(Category category) throws SQLException {
        String sql = "INSERT INTO categories (name) VALUES (?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, category.getCategoryName());
            statement.executeUpdate();
            try (var resultSet = statement.getGeneratedKeys()) {
                if (resultSet.next()) {
                    category.setCategoryId(resultSet.getInt(1));
                }
            }
            return category;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error...");
        }
    }
}
