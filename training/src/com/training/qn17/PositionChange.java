package com.training.qn17;

public class PositionChange {

	public static void main(String[] args) {
		String input1 = "curiosity";
		String output = "";
						
		for(int i=0;i< input1.length();i++) {
			
			if (i%2 == 0) {
				int positionAtCharacter = input1.charAt(i);
				char characterinPosition= (char)(positionAtCharacter+1);				
				input1.charAt(i);
				output += characterinPosition;
			} else {
				output += input1.charAt(i);
			}
		}
		System.out.println("Actual String is :" +input1 +" - and the output is :"+output);
	}

}
