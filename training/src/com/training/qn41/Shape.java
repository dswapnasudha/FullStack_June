package com.training.qn41;

public class Shape {
	
	protected String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName = shapeName ;
	}
	
	public double calculateArea() {
		
		System.out.println("In Base Class -Shape");
		return 0;
		
	}

}
