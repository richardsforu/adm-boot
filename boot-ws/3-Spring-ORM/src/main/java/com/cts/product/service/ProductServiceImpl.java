package com.cts.product.service;

import java.util.List;


import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;
	
	@Transactional()
	public void saveProduct(Product prod) {

		prodDao.saveProduct(prod);
		// 
		//
		//

	}

	// list all products

	@Transactional
	public List<Product> findAll() {
		return prodDao.findAll();

	}

}
