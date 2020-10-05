package com.stock.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stock.persistence.StockAccountRepository;
import com.stock.service.StockAccountService;
import com.stock.service.StockAccountServiceImpl;

//DONE Declare as a configuration class
@Configuration
public class SpringServicesConfig {
	
	//DONE Inject the repository
	@Autowired
	StockAccountRepository repository;
	
	//DONE Declare the stock account service bean
	@Bean
	public StockAccountService stockAccountService() {
		StockAccountServiceImpl stockAccountService = new StockAccountServiceImpl(repository);
		return stockAccountService;
	}
}