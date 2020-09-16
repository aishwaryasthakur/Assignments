package com.training;

public class Application {
	
	public static void main(String [] args) {
		
		Product tv = new Product(1010, "LED TV", 23000.00, 2);
		ManageProduct mgr = new ManageProduct();
		
		double discount = mgr.calculateDiscount(tv);
		System.out.println("Discount => " + discount);
		
		mgr.showProducts();
		
		double tax = mgr.calculateTax(tv);
		System.out.println("Tax => " + tax);
		
	}
}
