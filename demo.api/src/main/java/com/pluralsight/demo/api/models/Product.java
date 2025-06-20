package com.pluralsight.demo.api.models;

import java.math.BigDecimal;

public class Product {
    private int productId;
    private String productName;
    private int categoryId;
    private double unitPrice;

    public Product(int productId, String productName, int categoryId, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "com.pluralsight.demo.api.models.Product{" +
                "categoryId=" + getCategoryId() +
                ", productId=" + getProductId() +
                ", productName='" + getProductName() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                '}';
    }
}
