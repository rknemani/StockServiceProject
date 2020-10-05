package com.stock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stock.persistence.InMemoryStockAccountRepository;
import com.stock.persistence.StockAccountRepository;

//DONE Declare as a configuration class
@Configuration
public class SpringRepositoryConfig {
	
	//DONE Declare the stock account repository bean
	@Bean 
	public StockAccountRepository stockAccountRepository() {
		return new InMemoryStockAccountRepository();
	}
}