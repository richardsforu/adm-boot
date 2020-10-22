package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class SaveProduct {
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService ps = ac.getBean(ProductService.class);
		
		Product prod=new Product();
		prod.setId(7);
		prod.setName("Shirt");
		prod.setPrice(2500);
		prod.setDescription("Polo round neck t-shirt");
		
		ps.saveProduct(prod);
		
		
		
	}

}
