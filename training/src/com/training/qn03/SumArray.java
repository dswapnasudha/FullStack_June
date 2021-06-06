package com.training.qn03;

public class SumArray {

	public static void main(String[] args) {
		int[] input = {19,17,12};
		System.out.println(input.length);
		int i;
		int j;
		int maxValue=0;
		int minValue=0;
		
		for(i=1 ;i<input.length;i++) {
								
			if (input[0] >= input[i]) {
				maxValue = input[0];
			}
			else {
				maxValue = input[i];
			}
			
		}
		
		for(j=1 ;j<input.length;j++) {
			
			if (input[0] <= input[j]) {
				minValue = input[0];
			}
			else {
				minValue = input[j];
			}
		}	
		
		
		System.out.println("max value : " + maxValue);
		System.out.println("min value : " + minValue);		
		
		System.out.println("The sum of maximum and minimum values of an array are : "+ (maxValue+minValue));
	}
}


