package com.training.example.two;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		// TODO Auto-generated method stub
		switch (key) {
		case 3: return new Tractor();
		}
		return super.getProduct(key);
	}
	
	

}
