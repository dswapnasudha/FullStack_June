package com.training.qn40;

public class Rectangle extends Shape {
	int length;
	int breadth;
	
	public Rectangle(int length,int breadth) {
		super("Rectangle");
		this.length= length;
		this.breadth = breadth;
		
	}
		
	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public double calculateArea(){
		double area;
		System.out.println("In  Class -Rectangle");
		area = length * breadth;
		return area;
		
	}
	
}