package com.training.qn07;

public class EmailValidation {

	public static void main(String[] args) {
		String input="test@gmail.com";
		String endValue=".com";
		boolean valid5 = false;
		int len=input.length();
		
		//Validation 5
		if (input.endsWith(endValue)) {			
			valid5= true;
			System.out.println("Validation 5 passes and mail ID ends with: "+ endValue);
		}else {
			valid5= false;
			System.out.println("Validation 5 fails and email not ends with: "+ endValue);
		}
		
		
		
	}

}
