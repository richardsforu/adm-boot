package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bill.BillingImpl;
import com.config.AppConfig;

public class Test {

	public static void main(String[] args) {

		String[] cart1= {"I01","I02","I03"};
		String[] cart2= {"I01","I02"};

		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		BillingImpl biller = ac.getBean(BillingImpl.class);
		
		
		double total= biller.getCartTotal(cart1);
		
		System.out.println("cart1 total is "+total);
		
		total= biller.getCartTotal(cart2);
		System.out.println("cart2 total is "+total);

		
	}

}
