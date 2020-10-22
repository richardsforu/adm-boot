package com.cts.product.service;

import java.util.List;

import javax.transaction.Transactional;

import com.cts.product.entity.Product;

public interface ProductService {

	void saveProduct(Product prod);

	List<Product> findAll();

}