package com.training.qn32;

public class RedCross {
	
	public static void main(String[] args) {
		
		int noOfTents = 5;
		int[] noOfRefugees = {10, 12, 30, 12, 12} ;
		int peopleCount = 0;
		
		for(int i = 0;i< noOfRefugees.length;i++) {
			peopleCount += noOfRefugees[i];  
			
		}
		System.out.println("The Total no of citizens present in "+noOfTents+ " tents in the camp: "+peopleCount);
	}
	
	
}
