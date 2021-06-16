package com.training.qn33;

public class RedCross {
	
	public static void main(String[] args) {
		
		int noOfTents = 5;
		int[] noOfRefugees = {10, 12, 30, 12, 12} ;
		int peopleCount = 0;
		int len = noOfRefugees.length;
		int i = 0;
		while(i< len) {
			peopleCount += noOfRefugees[i];
			i++;
		}
		System.out.println("The Total no of citizens present in "+noOfTents+ " tents in the camp: "+peopleCount);
	}
	
	
}
