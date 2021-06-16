package com.training.qn42;

public class Delivery {

	public void displayDeliveryDetails(String bowler, String batsman) {
		String[] bowlerLastName=bowler.split(" ");
		String[] batsmanLastName=batsman.split(" ");
		
		System.out.println("Name of Bowler: " +bowlerLastName[1]+ " " + "and Name of batsman: "+batsmanLastName[1]);
		
	}
	
	void displayDeliveryDetails(Long runs) {
		if (runs==6)
			System.out.println("It is Sixer: " + runs);
		else if (runs == 4)	
			System.out.println("It is boundary: " + runs);
		else
			System.out.println("Runs: "+ runs);
	}
}
