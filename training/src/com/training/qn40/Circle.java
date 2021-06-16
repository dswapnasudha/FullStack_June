package com.training.qn40;

public class Circle extends Shape {
	int radius;
	
	
	public Circle(int radius) {
		super("Circle");
		this.radius= radius;				
	}
	
		
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public double calculateArea(){
		double area;
		System.out.println("In  Class -Circle");
		area = 3.14 * radius * radius;
		return area;
		
	}
}