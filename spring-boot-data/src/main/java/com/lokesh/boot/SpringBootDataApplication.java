package com.lokesh.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDataApplication {

	@Autowired
	private StockRepository repo;
	
	
	@RequestMapping("/stocks/{symbol}")
	public Stock stocks(@PathVariable("symbol") String symbol){
		return repo.findBySymbol(symbol);
		
	}
	
	@RequestMapping("/stocks/create")
	public String createStock(){
		Stock stock = new Stock();
		stock.setCeo("Lokesh");
		stock.setCompanyName("Lokesh Company");
		stock.setPrice(33.43);
		stock.setStockId(8);
		stock.setSymbol("LC");
		repo.save(stock);
		return "created";
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}
}
