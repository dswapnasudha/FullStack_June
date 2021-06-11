package com.training.qn08;

public class SquareRoot {

	public static void main(String[] args) {
		double x1=5;
		double x2=6;
		double y1=8;
		double y2=3;
		double finalValue;
		finalValue = ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2));
		System.out.println(finalValue);
		int squareRootValue = (int)Math.sqrt(finalValue);
		System.out.println(squareRootValue);
	}

}
