package com.training.classes;

import java.util.Scanner;

import com.training.ifaces.RentItems;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AoneAgency agency = new AoneAgency();
		double totalAmount = 0.00;
		String [] items = new String[10];
		int iterator = 0;
		
		System.out.println("Enter 1 - Computer\n 2 - Furniture\n 0 - Exit");
		int choice = sc.nextInt();
		
		while(choice != 0) {
			
			System.out.println("Enter Item Name");
			String name = sc.next();
			System.out.println("Enter Rate Per Unit");
			Double rate = sc.nextDouble();
			System.out.println("Enter quantity");
			int quantity = sc.nextInt();
			System.out.println("Enter days");
			int days = sc.nextInt();
			
			RentItems selected = agency.getProduct(choice, name, rate, quantity, days);
			
			if(selected == null) {
				System.out.println("object is NULL");
			}
			else {
				double itemPrice = agency.printTotalAmount(selected);
				items[iterator] = name;
				items[iterator + 1] = Double.toString(itemPrice); 
				iterator = iterator+2;
				totalAmount = totalAmount + itemPrice;
			}
			System.out.println("Enter 1 - Computer\n 2 - Furniture\n 0 - Exit");
			choice = sc.nextInt();
		}
		for(int i=0; i<=iterator-2; i = i + 2)
		{
			System.out.println("Item Name : " + items[i]);
			System.out.println("Item Price : " + items[i+1]);
		}
		System.out.println("---------------");
		System.out.println("Total Amount : " + totalAmount);
		sc.close();	
	}
}
