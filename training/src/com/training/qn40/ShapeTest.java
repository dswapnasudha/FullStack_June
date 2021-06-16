package com.training.qn40;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shapeSquare = new Square(20);
		double areaOfSquare = shapeSquare.calculateArea();
	
		System.out.println("The Area of the Square is: "+ areaOfSquare);
		
		Shape shapeRectangle = new Rectangle(100,40);
		double areaOfRectangle = shapeRectangle.calculateArea();
		System.out.println("The Area of the Square is: "+ areaOfRectangle);
		
		Shape shapeCircle = new Circle(5);
		double areaOfCircle = shapeCircle.calculateArea();
		System.out.println("The Area of the Square is: "+ areaOfCircle);		
		
	}

}
