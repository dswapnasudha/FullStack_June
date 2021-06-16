package com.training.qn19;

public class SumOfSquares {
	
	public int calculateDifference(int n) {
		int sum = 0;
		int sumOfTheSquares = 0;
		int squareOfSum = 0;
		sumOfTheSquares = n*(n+1)*(2*(n)+1)/6;
		squareOfSum = (n*(n+1)/2) * (n*(n+1)/2);
		sum =sumOfTheSquares - squareOfSum;
		return sum;
	}

	public static void main(String[] args) {
		SumOfSquares sum = new SumOfSquares();
		int n = 10;
		int sumOfSquares =sum.calculateDifference(n);
		System.out.println("The difference between the sum of the squares of the first "+ n +" natural numbers and the square of their sum is: "+sumOfSquares);

	}

}
