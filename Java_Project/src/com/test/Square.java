package com.test;

public class Square extends Shape {

	//public double side;//encapsulation
	
	//create constructor
	
	/*public Square(double side) {
		this.side = side;
		
		
	}
	
	
	public double calculateArea() {
		
		return (side*side);
		
	}
    public double perimeter() {
		
		return (4*side);
		
	}
    
    public void setSide(double side) {
         
    	this.side = side;	
    
    }
    
    public  double getSide() {
        
    	return side;	
    
    }
    */
	public double findArea() {
    	return getLength()*getBreadth();
    }
    public double findPerimeter() {
    	return 2 * (getLength()*getBreadth());
    }

}
