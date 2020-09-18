package com.training;

public class WrapperAndStatic {
	
	private int id=1;
	private static String aadharNumber="77";
	
	//instance variable, instance method, static variable and static method can be accessed
	//in instance method
	public void show() {
		System.out.println(id);
		System.out.println(aadharNumber);
	}

	//static variable and static method only can be accessed
	//in static method
	public static void display() {
		//System.out.println(id);
		System.out.println(aadharNumber);
		
	}
	
	public void parse(String number) {
		int num = Integer.parseInt(number);
		System.out.println(++num);
	}
	
	public void useToString(int num)
	{
		System.out.println(Integer.toString(num).length());
	}
	
	public void useValueOf() {
		String age = "1010";
		System.out.println(Integer.valueOf(age, 2));
	}
	
	public static void main(String args[])
	{
		WrapperAndStatic ws = new WrapperAndStatic();
		ws.show();
		WrapperAndStatic.display();
		ws.parse("99");
		ws.useToString(9999);
		ws.useValueOf();
	}
}
