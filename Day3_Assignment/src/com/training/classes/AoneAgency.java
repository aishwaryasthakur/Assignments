package com.training.classes;

import com.training.ifaces.RentItems;

public class AoneAgency {
	
	public RentItems getProduct(int key, int quantity, int days) {
		
		switch (key) {
		case 1: return new Computer(quantity, days);
		case 2: return new Furniture(quantity, days);
		default: return null;
		}
	}

	public double printTotalAmount(RentItems items) {
		
		double itemPrice = items.calculateAmount();
		System.out.println("Item Name : " + items.getitemName());
		System.out.println("Item Price : " + itemPrice);
		return itemPrice;
	}

}
