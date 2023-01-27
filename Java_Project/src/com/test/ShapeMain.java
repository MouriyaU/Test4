package com.test;

public class ShapeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square obj_square = new Square();
		obj_square.setLength(34.5);
		obj_square.setBreadth(34.5);
		System.out.println("area :"+ obj_square.findArea());
		System.out.println("perimeter :"+ obj_square.findPerimeter());
		Shape obj_shape = new Shape();
		obj_shape.setLength(34.5);
		obj_shape.setBreadth(34.5);
		System.out.println("area :"+ 	obj_shape.findArea());
		System.out.println("perimeter :"+ 	obj_shape.findPerimeter());
		Shape obj_shape1 = new Square();
		obj_shape1.setLength(34.5);
		obj_shape1.setBreadth(34.5);
		System.out.println("area :"+ 	obj_shape1.findArea());
		System.out.println("perimeter :"+ 	obj_shape1.findPerimeter());
	}

}
