package com.pricematrix;

// dependency
public class PriceMatrixImpl {

	public PriceMatrixImpl() {
		System.out.println("==> PriceMatrixImpl object created...");
	}

	public double getItemPrice(String itemCode) {
		// fetch itemPrice for the given itemCode from DB
		return 100.00;
	}
}
