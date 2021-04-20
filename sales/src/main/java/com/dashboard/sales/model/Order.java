package com.dashboard.sales.model;

import java.util.Date;

public class Order {
    private int id;
    private Date orderDate;
    private int storeId;
    private int customerId;

    public Order(int id, Date orderDate, int storeId, int customerId) {
        this.id = id;
        this.orderDate = orderDate;
        this.storeId = storeId;
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", storeId=" + storeId +
                ", customerId=" + customerId +
                '}';
    }
}
