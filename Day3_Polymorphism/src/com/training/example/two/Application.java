package com.training.example.two;

import com.training.ifaces.Automobile;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		ShowRoom saiCars = new NewShowRoom();
		
		while(choice != 0) {
			
			Automobile selected = saiCars.getProduct(choice);
			
			if(selected == null) {
				System.out.println("object is NULL");
			}
			else {
				saiCars.printQuotation(selected);
			}
			choice = sc.nextInt();
		}
		System.out.println("OK BYE");
		sc.close();	
		
		//int choicce = Integer.parseInt(args[0]);

	}

}
