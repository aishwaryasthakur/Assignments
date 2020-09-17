package com.training;

public class Application {
	
	public static void main(String[] args) {
		
		Lawyer rajesh = new Lawyer(494949, "Rajesh Khanna", "High Court", "B.L");
		
		Musician sharma = new Musician(23233, "Umesh Sharma", "Shenoy", "Allahabad");
		
		Billing bill = new Billing();
		
		bill.printFees(sharma);
		bill.printFees(rajesh);
		
	}

}
