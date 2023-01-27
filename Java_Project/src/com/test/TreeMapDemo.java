package com.test;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap <Integer,String> Employess = new TreeMap<Integer, String>();

		Employess.put(1, "Anjali");

		Employess.put(1, "Aparna");

		Employess.put(1, "Rani");
		

		Employess.put(1, "Ranjin");

		Employess.put(1, "Jay");
		
		
		System.out.println(Employess.headMap(3));
		

		System.out.println(Employess.tailMap(3));
		

		System.out.println(Employess.subMap(1,5));
	}

}
