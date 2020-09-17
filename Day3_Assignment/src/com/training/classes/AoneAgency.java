package com.training.classes;

import com.training.ifaces.RentItems;

public class AoneAgency {
	
	public RentItems getProduct(int key, String itemName, double ratePerUnit, int quantity, int days) {
		
		switch (key) {
		case 1: return new Computer(itemName, ratePerUnit, quantity, days);
		case 2: return new Furniture(itemName, ratePerUnit, quantity, days);
		default: return null;
		}
	}

	public double printTotalAmount(RentItems items) {
		
		return items.calculateAmount();
	}

}
