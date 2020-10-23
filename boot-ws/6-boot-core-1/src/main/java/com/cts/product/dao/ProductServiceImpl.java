package com.cts.product.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;
	
	@Value("${name}")
	private String name;

	@Override
	public void saveProduct() {
		System.out.println("Name: "+name);
		prodDao.saveProduct();
	}

}
