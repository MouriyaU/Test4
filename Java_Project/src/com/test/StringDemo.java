package com.test;

public class StringDemo {
	
	public static void main(String[] args) {
		
		int a = 15;
		
		String c= "Hello Everyone";
		String d = "this is the third session";
		String e = c+a;
		String text = "thor and loki are \"norse\" gods";
		String b = Integer.toString(a);
		
		
		String greeting = "Hello Everyone";
		System.out.println(greeting.length());
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting.toLowerCase());
		System.out.println(greeting.equalsIgnoreCase(c));
		
		System.out.println("Concodination of two string is " + greeting + ""+d);
		
		System.out.println(greeting.concat(d));
		
		System.out.println(e);
		
		System.out.println(text);
		
		String text2 =  "thor and loki are \rnorse\r gods";
		System.out.println(text2);
		
	}

}
