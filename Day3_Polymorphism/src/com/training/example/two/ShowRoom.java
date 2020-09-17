package com.training.example.two;

import com.training.ifaces.Automobile;

public class ShowRoom {
	
	//Factory Method - Based on the Key passed
	//Returns the Object of Type Automobile
	
	public Automobile getProduct(int key) {
		
		switch (key) {
		case 1: return new Bike();
		case 2: return new Car();
		default: return null;
		}
	}

	public void printQuotation(Automobile polyAuto) {
		
		System.out.println(Automobile.APPNAME);
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
	}
}
