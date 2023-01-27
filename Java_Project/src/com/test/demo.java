package com.test;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s1 = new Square(100.7);
		//s1.side = 4;
		//s1.setSide(17.7);
		System.out.println("side of the square :"+s1.getSide());
		System.out.println("area of the square is :"+ s1.calculateArea());
		System.out.println("perimeter of the square is:"+ s1.perimeter());
		
		
		//Rectangle
		
		Rectangle obj_rectangle = new Rectangle();
		System.out.println("Length :" +obj_rectangle.getLength());
		System.out.println("Breadth : " +obj_rectangle.getBreadth());
		System.out.println("Area"+obj_rectangle.findArea());
		System.out.println("Perimeter :"+obj_rectangle.findPerimeter());
		
		
		
	}

}
