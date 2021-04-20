package com.dashboard.sales.view;

import com.dashboard.sales.controller.MainController;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesApplication {

	public static void main(String[] args) {
		MainController mainController = new MainController();
		mainController.run();

		SpringApplication.run(SalesApplication.class, args);
	}

}
