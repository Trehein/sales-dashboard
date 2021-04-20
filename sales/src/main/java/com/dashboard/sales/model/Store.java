package com.dashboard.sales.model;

public class Store {
    private int id;
    private int addressId;

    public Store(int id, int addressId) {
        this.id = id;
        this.addressId = addressId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", addressId=" + addressId +
                '}';
    }
}
