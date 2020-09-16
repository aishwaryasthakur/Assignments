package com.training;

public class Application {
	
	public static void main(String [] args) {
		
//		Insurance person1 = new Insurance(21, "Aishwarya", 22, 30000.00);
//		System.out.println("Premium : " + person1.calculatePremium());
		
		VehicleInsurance activa = new VehicleInsurance(21, "Aishwarya", 22, 30000.00, "Two Wheeler", 2018, 70000.00);
		double premium = activa.calculatePremium();
		
		System.out.println(premium);
		
	}

}
