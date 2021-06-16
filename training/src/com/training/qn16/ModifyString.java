package com.training.qn16;

public class ModifyString {

	public static void main(String[] args) {
		String input1 = "New York";
		String input2= "New Jersy";
		
		String input1Case = input1.toLowerCase();
		String input2Case = input2.toLowerCase();
		
		char[] input1Char;
		input1Char = input1Case.toCharArray();
		System.out.println(input1Char);
		char[] input2Char;
		input2Char = input2Case.toCharArray();
		System.out.println(input2Char);
		String temp = "";
		
		int firstLength=input1Case.length();		
		int secondLength = input2Case.length();		
		int count =0;
		
		for(int i=0;i< firstLength; i++) {
			for(int j=0 ;j<secondLength;j++) {
				count = 0;
				if (input1Char[i] == input2Char[j]) {					  				  
					  count =count+1;
					  break; 
				 } 
			}
			if (count > 0) {
				temp += input1Char[i];
				
			}else { 				   
		  	  	  temp +='+';
			}
			
		}
		System.out.println(temp);
	}

}
