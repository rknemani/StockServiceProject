package com.stock.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.domain.StockAccount;
import com.stock.service.StockAccountService;

//DONE Declare the class is a REST Controller
//DONE Map the entire class to the /accounts URI
@RestController
@RequestMapping("/accounts")
public class StockAccountResource {

	//DONE Inject the stock account service
	@Autowired
	StockAccountService sto;
	
	//DONE Create a method to retrieve all the stock accounts
 	@RequestMapping
	public Collection<StockAccount> getAllStockAccounts() {
		Collection<StockAccount> results = sto.findAll();
		return results;
	}
 	
	//DONE Create a method to retrieve a stock account by id
    @RequestMapping("/id/{id}") 
  	public StockAccount findStockAccount(@PathVariable("id")Long id) {
 	   return sto.findById(id);
 	}
	
	//DONE Create a method to retrieve a stock account by name
    @RequestMapping("/name/{name}") 
  	public StockAccount findStockAccountName(@PathVariable("name")String name) {
       return sto.findAll()
       .stream()
       .filter(e -> e.getName().equals(name)) 
       .findFirst().orElse(null);
 	}
}
