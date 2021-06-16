package com.training.qn18;

public class NaturalNumbersSum {
	
	public int calculateSum(int n) {
		int sum = 0;		
		sum = n*(n+1)/2;		
		return sum;
	}

	public static void main(String[] args) {
		
		NaturalNumbersSum sum = new NaturalNumbersSum();
		int number = 10;
		int sumOfNaturalNumers = sum.calculateSum(number);
		System.out.println("The Sum of "+ number + " Natural Numbers are: "+ sumOfNaturalNumers);
	}

}
