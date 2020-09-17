package com.training.ifaces;

public interface Automobile {
	
	String APPNAME = "Quotation Generation System";
	
	
	//All the three methods are public and abstract by default
	//to understand that we have added the same in different methods
	public abstract String getColor();
	public String getModel();
	double getPrice();

}
