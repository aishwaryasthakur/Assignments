package com.training;

public class Application {
	
	public static void main(String [] args) {
		
//		Insurance person1 = new Insurance(21, "Aishwarya", 22, 30000.00);
//		System.out.println("Premium : " + person1.calculatePremium());
		
		VehicleInsurance activa = new VehicleInsurance(21, "Aishwarya", 22, 30000.00, "Two Wheeler", 2019, 70000.00);
		double premium = activa.calculatePremium();
		System.out.println(premium);
		
		VehicleInsurance wego = new VehicleInsurance(22, "Ak", 25, 50000.00, "Two Wheeler", 2017, 100000.00);
		premium = wego.calculatePremium();
		System.out.println(premium);
		
		VehicleInsurance swift = new VehicleInsurance(23, "At", 24, 20000.00, "Four Wheeler", 1990, 90000.00);
		premium = swift.calculatePremium();
		System.out.println(premium);
		
		VehicleInsurance kia = new VehicleInsurance(24, "Al", 20, 10000.00, "Four Wheeler", 2020, 80000.00);
		premium = kia.calculatePremium();
		System.out.println(premium);
		
	}

}
