package com.training.classes;

import com.training.ifaces.RentItems;

public class Furniture implements RentItems {

	private int quantity;
	private int day;

	
	public Furniture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Furniture(int quantity, int day) {
		super();
		this.quantity = quantity;
		this.day = day;
	}

	@Override
	public String getitemName() {
		// TODO Auto-generated method stub
		return "Table";
	}

	@Override
	public double getratePerUnit() {
		// TODO Auto-generated method stub
		return 200.00;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public double calculateAmount() {
		// TODO Auto-generated method stub
		return this.getQuantity()* this.getDay() * this.getratePerUnit();
	}

}
