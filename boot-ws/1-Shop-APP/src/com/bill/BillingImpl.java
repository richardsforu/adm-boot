package com.bill;

import com.pricematrix.PriceMatrixImpl;
//dependent
public class BillingImpl {
	
	/*
	 * 
	 * Types of objects in java: 2 types
	 * 		-> dependency 
	 * 		-> dependent
	 * 
	 * 
	 *  Design issues 
	 *  ----------------
	 *  
	 *  -> too many dependency object creations
	 *  	-> issues with memory management
	 *  	-> perfomance goes down
	 *  
	 *  Why these issues happened?
	 *  ------------------------------
	 *  -> Dependent class itself creating dependency class obj directly
	 *  
	 *  What is the solution to this problem?
	 *  --------------------------------------
	 *  -> Do not create dependency object directly from dependent classes
	 *  -> Instead, use techniques like JNDI look up .. etc
	 *  
	 *  Problems using JNDI 
	 *  --------------------
	 *  -> JNDI location is tightly coupled with dependency  class location
	 *  
	 *  What is the best solution?
	 *  -----------------------------
	 *  -> do not create, do not find/search. Instead ask some one (containers) (IoC) -> Inversion of control
	 *  
	 *   What is Dependency Injection (DI)
	 *   -> Injecting dependency object to the dependent object.
	 *   
	 *   How many ways DI can be implemented? : 2 ways
	 *   	-> using setter based DI
	 *   	-> using constructor based DI
	 *   
	 *   setter based DI
	 *   ------------------
	 *   -> define dependency class referance in the dependent class at class level.
	 *   -> create setter for the defined dependency refarence in the dependent class.
	 *   
	 *   
	 *    
	 * 
	 */

	
	private PriceMatrixImpl price;
	
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}


	public double getCartTotal(String[] cart) {

		//PriceMatrixImpl price = new PriceMatrixImpl(); // dependency
		
		double total = 0.0;
		
		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
