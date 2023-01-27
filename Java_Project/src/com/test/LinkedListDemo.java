package com.test;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[] List = new String[5];
		List[0] = "Maruti";
		List[3] = "Toyota";
		for (String i: List)
		{
		
		System.out.println(i);
		}
		*/
		
		LinkedList<String> myCountries = new LinkedList<String>();
		myCountries.add("India");
		myCountries.add("Russia");
		myCountries.add("Switzerland");
		myCountries.add("Australia");
		myCountries.add("Canada");
		myCountries.add("UK");	
		System.out.println(myCountries);
		Collections.sort(myCountries);
		System.out.println(myCountries);
		myCountries.addFirst("Newzealand");
		System.out.println(myCountries);
		myCountries.addLast("North Kprea");
		System.out.println(myCountries);
		myCountries.removeFirst();
		System.out.println(myCountries);
		myCountries.removeLast();
		System.out.println(myCountries);
		myCountries.get(1);
		System.out.println(myCountries);
		
		

	}

}
