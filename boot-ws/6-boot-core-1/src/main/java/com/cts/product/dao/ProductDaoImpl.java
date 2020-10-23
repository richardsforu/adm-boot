package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Override
	public void saveProduct() {
		System.out.println("--- saving product");
	}

}
