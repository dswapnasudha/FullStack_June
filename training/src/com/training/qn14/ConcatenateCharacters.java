package com.training.qn14;

public class ConcatenateCharacters {

	public static void main(String[] args) {
		String[] input= {"abc","da","ram"};
		int input2 = 4;
		char val = ' ';
		String finalValue =" ";
		System.out.println(input.length);
		
		for(int i=0;i< input.length;i++) {
			System.out.println(input[i]);
			System.out.println(input[i].length());
			if (input[i].length() >= input2) {
				 val = input[i].charAt(input2 - 1);
				 
				System.out.println(val);
				
			} else if(input[i].length() < input2){
				 val = '$';
				 
				System.out.println(val);
			}
			
			finalValue +=val;
		}
		
		System.out.println("The value after concatinating all the given position values: " + finalValue);
		
	}

}
