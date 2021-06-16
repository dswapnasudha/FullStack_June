package com.training.qn41;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shapeSquare = new Square(20);
		double areaOfSquare = shapeSquare.calculateArea();	
		System.out.println("The Area of the Square is: "+ areaOfSquare);
		System.out.println(shapeSquare.shapeName);
		
		Shape shapeRectangle = new Rectangle(100,40);
		double areaOfRectangle = shapeRectangle.calculateArea();
		System.out.println("The Area of the rectangle is: "+ areaOfRectangle);
		System.out.println(shapeRectangle.shapeName);
		
		
		Shape shapeCircle = new Circle(5);
		double areaOfCircle = shapeCircle.calculateArea();
		System.out.println("The Area of the circle is: "+ areaOfCircle);
		System.out.println(shapeCircle.shapeName);
		
		Shape shapeHexagon=new Hexagon(20);
		double areaOfHexagon = shapeHexagon.calculateArea();
		System.out.println("The Area of the Hexagon is: "+ areaOfHexagon);
		System.out.println(shapeHexagon.shapeName);
	}

}
