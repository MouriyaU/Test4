package com.test;

public class Calculation {
	
	public static void main(String args[]) {
		
		Addcalculator a_obj = new Addcalculator();
		System.out.println("Add two number" + a_obj.add(5, 6));
		System.out.println(a_obj.add("Hi","Class"));
	}

}
