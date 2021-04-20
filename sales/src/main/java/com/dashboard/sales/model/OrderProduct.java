package com.dashboard.sales.model;

public class OrderProduct {
    private int id;
    private int orderId;
    private int productId;

    public OrderProduct(int id, int orderId, int productId) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                '}';
    }
}
