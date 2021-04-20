package com.dashboard.sales.model;

public class Product {
    private int id;
    private String name;
    private double salePrice;
    private double cost;
    private int categoryId;

    public Product(int id, String name, double salePrice, double cost, int categoryId) {
        this.id = id;
        this.name = name;
        this.salePrice = salePrice;
        this.cost = cost;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salePrice=" + salePrice +
                ", cost=" + cost +
                ", categoryId=" + categoryId +
                '}';
    }
}
