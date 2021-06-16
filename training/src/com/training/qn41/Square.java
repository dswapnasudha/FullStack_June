package com.training.qn41;

public class Square extends Shape {
	int side;
	
	public Square(int side) {
		super("Square");
		this.side=side;
	}
	
		
	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}


	public double calculateArea(){
		double area;
		System.out.println("In  Class -Square");
		area = side * side;
		return area;
		
	}
	

}
