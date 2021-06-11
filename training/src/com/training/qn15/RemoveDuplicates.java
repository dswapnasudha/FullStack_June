package com.training.qn15;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input="helloworld";
		String output = "";
		System.out.println("The Given String value is :" +input);
		char[] ch = input.toCharArray();	
		 
	    for(int i=0; i<=ch.length-1; i++){
	        
	        	if (!output.contains(ch[i] + ""))
	        	output = output + ch[i];
	        
	    }
	    System.out.println("After removing duplicates the string is :" +output);
	}

}
