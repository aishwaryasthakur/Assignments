package com.training.classes;

import java.util.Scanner;

import com.training.ifaces.RentItems;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		AoneAgency agency = new AoneAgency();
		double totalAmount = 0.00;
		
		while(choice != 0) {
			
			int quantity = sc.nextInt();
			int days = sc.nextInt();
			
			RentItems selected = agency.getProduct(choice, quantity, days);
			
			if(selected == null) {
				System.out.println("object is NULL");
			}
			else {
				double itemPrice = agency.printTotalAmount(selected);
				totalAmount = totalAmount + itemPrice;
			}
			choice = sc.nextInt();
		}
		System.out.println("Total Amount : " + totalAmount);
		sc.close();	
	}
}
