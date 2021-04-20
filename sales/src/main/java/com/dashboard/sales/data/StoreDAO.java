package com.dashboard.sales.data;

import com.dashboard.sales.model.Store;

import java.util.List;

public interface StoreDAO {
    public List<Store> getAllStores();

    public void insertStore();
}
