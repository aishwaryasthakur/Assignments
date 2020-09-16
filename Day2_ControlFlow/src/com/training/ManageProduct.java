package com.training;

public class ManageProduct {

	public Product [] calculateDiscount(Product [] productList) {
		
		double discount = 0.0;
		
		for(int i=0; i<productList.length; i++)
		{
			if(productList[i].getRatePerUnit() > 500 && productList[i].getRatePerUnit() <= 1000) {
				discount = 0.10;
			}
			else if(productList[i].getRatePerUnit() > 1000) {
				discount = 0.15;
			}
			
			productList[i].setDiscount(discount);
		}
		
		return productList;
		
	}
	
	public void showProductsLegacy(Product [] productList) {
		
		for(int i=0; i<productList.length; i++)
		{
			System.out.println(productList[i].toString());
		}
	}
	
	public void showProductForEach(Product [] productList) {
		
		for(Product eachProduct : productList) {
			System.out.println("Product Name : " + eachProduct.getProductName());
			System.out.println("Rate Per Unit : " + eachProduct.getRatePerUnit());;
		}
	}
	
	public double calculateTax(Product product) {
		
		double tax = 0.0;
		
		switch(product.getProductType()) {
		
		case 1 : tax = 0.05;
				break;
		case 2 : tax = 0.10;
				break;
		case 3 : tax = 0.15;
				break;
		default : tax = 0.28;
				break;
		}
		
		return tax;
		
	}
	
	public double calculatedDiscountAmount(Product product)
	{
		double amount = product.getRatePerUnit() - (product.getRatePerUnit() * product.getDiscount());
		amount = amount * product.getQuantity();
		return amount;
	}
	
}
