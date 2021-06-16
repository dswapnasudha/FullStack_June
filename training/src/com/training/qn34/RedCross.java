package com.training.qn34;

public class RedCross {
	
	public static void main(String[] args) {
		
		int noOfTents = 5;
		int[] noOfRefugees = {10, 12, 30, 12, 12} ;
		int peopleCount = 0;
		
		for(int count :noOfRefugees ) {
			System.out.println(count);
			peopleCount = peopleCount + count;
		}
		System.out.println("The Total no of citizens present in "+noOfTents+ " tents in the camp: "+peopleCount);
	}
	
	
}
