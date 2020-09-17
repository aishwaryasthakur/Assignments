package com.training.classes;

import com.training.ifaces.RentItems;

public class Furniture implements RentItems {

	private String itemName;
	private double ratePerUnit;
	private int quantity;
	private int day;

	public Furniture(String itemName, double ratePerUnit, int quantity, int day) {
		super();
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
		this.quantity = quantity;
		this.day = day;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
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
		return this.getQuantity()* this.getDay() * this.getRatePerUnit();
	}}
