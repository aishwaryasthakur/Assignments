package com.training;

public class VehicleInsurance extends Insurance{
	
	private String vehicleModel;
	private int yearOfManufature;
	private double costOfvehicle;
	
	public VehicleInsurance(int policyNumber, String policyHoldername, int policyHolderAge, double insuredAmount, String vehicleModel, int yearOfManufature, double costOfvehicle) {
		super(policyNumber, policyHoldername, policyHolderAge, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearOfManufature = yearOfManufature;
		this.costOfvehicle = costOfvehicle;
	}
	
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearOfManufature() {
		return yearOfManufature;
	}
	public void setYearOfManufature(int yearOfManufature) {
		this.yearOfManufature = yearOfManufature;
	}
	public double getCostOfvehicle() {
		return costOfvehicle;
	}
	public void setCostOfvehicle(double costOfvehicle) {
		this.costOfvehicle = costOfvehicle;
	}
	
	@Override
	public double calculatePremium() {
		
		double premium = 0.0;
		
		if(this.getVehicleModel().equals("Two Wheeler")) {
			
			if((2020 - this.getYearOfManufature()) < 2) {
				premium = this.getCostOfvehicle() * 0.5;		
			}
			else {
				premium = this.getCostOfvehicle() * 0.6;
			}
		}
		else if(this.getVehicleModel().equals("Four Wheeler")) {
			
			if((2020 - this.getYearOfManufature()) < 2) {
				premium = this.getCostOfvehicle() * 0.5;		
			}
			else {
				premium = this.getCostOfvehicle() * 0.6;
			}
		}
		
		return premium;
	}
}
