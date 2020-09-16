package com.training;

public class Application {
	
	public static void main(String [] args) {
		
		Product tv = new Product(1010, "LED TV", 23000.00, 2);
		ManageProduct mgr = new ManageProduct();
		
		/*double discount = mgr.calculateDiscount(tv);
		System.out.println("Discount => " + discount);
		
		
		double tax = mgr.calculateTax(tv);
		System.out.println("Tax => " + tax);*/
		
		Product [] productList = new Product[2];
		
		productList[0] = tv;
		productList[1] = new Product(1011, "Fridge", 15000.00, 1);
		
		//mgr.showProductsLegacy(productList);
		//mgr.showProductForEach(productList);
		
		productList[0].setQuantity(2);
		productList[1].setQuantity(1);
		
		productList = mgr.calculateDiscount(productList);
		
		for(int i=0; i<productList.length; i++)
		{
			System.out.println(productList[i].getProductName() + " : " + mgr.calculatedDiscountAmount(productList[i]));
		}
		
	}
}
