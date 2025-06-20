package com.pluralsight.demo.api.Dao;

import com.pluralsight.demo.api.models.Product;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
    @Override
    public Product insert(Product product) throws SQLException {
        String sql = "INSERT INTO products (name, price, category_id) VALUES (?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, product.getProductName());
            statement.setBigDecimal(2, product.getUnitPrice());
            statement.setInt(3, product.getCategoryId());
            statement.executeUpdate();
            try (var resultSet = statement.getGeneratedKeys()) {
                if (resultSet.next()) {
                    product.setProductId(resultSet.getInt(1));
                }
            }
            return product;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error...");
        }
    }
}



