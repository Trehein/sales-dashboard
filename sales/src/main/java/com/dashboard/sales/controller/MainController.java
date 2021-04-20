package com.dashboard.sales.controller;

import org.apache.commons.dbcp.BasicDataSource;

import java.util.List;

public class MainController {

    public static void run() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:postgresql://localhost:5432/puppies");
        ds.setUsername("postgres");
        ds.setPassword("postgres1");

        System.out.println("test run");
    }



}
