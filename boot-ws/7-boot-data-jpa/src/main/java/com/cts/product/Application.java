package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ac= SpringApplication.run(Application.class, args);
	
	ProductDao prodDao = ac.getBean(ProductDao.class);
	
	
	Product product=prodDao.findById(200).orElse(null);
	
	if(product!=null) {
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getDescription());
	}else {
		System.out.println("Id 200 not found");
	}
	
	
	/*
	prodDao.findAll().forEach(product->{
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getDescription());
		
		System.out.println("----------------------------");
	});
	*/
	
	}
	

}
