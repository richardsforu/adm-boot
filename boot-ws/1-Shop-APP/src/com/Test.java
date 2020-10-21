package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1= {"I01","I02","I03"};
		String[] cart2= {"I01","I02"};

		//---------------------------------------------------------
	     	PriceMatrixImpl price=new PriceMatrixImpl(); // dependency
		//---------------------------------------------------------
		BillingImpl biller=new BillingImpl(); // dependent
		
		biller.setPrice(price); // Injecting/passing dependency object (price) to the dependent object (biller) : DI
		
		
		double total= biller.getCartTotal(cart1);
		
		System.out.println("cart1 total is "+total);
		
		total= biller.getCartTotal(cart2);
		System.out.println("cart2 total is "+total);

		
	}

}
