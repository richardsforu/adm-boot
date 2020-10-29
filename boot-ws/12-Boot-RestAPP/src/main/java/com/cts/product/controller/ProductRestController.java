package com.cts.product.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductRestController {
	
	@GetMapping
	public String welcome() {
		return "Welcome to Spring boot Rest APP";
	}

}
