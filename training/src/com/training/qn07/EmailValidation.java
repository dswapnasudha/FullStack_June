package com.training.qn07;

public class EmailValidation {

	public static void main(String[] args) {
		String input="test@gmail.com";
		String endValue=".com";
		boolean validation1 = false;
		boolean validation2 = false;
		boolean validation3 = false;
		boolean validation4 = false;
		boolean validation5 = false;
		int count1 = 0;
		int count2 = 0;
		int len=input.length();
		char[] inputChar =input.toCharArray();
		int firstIndex = input.indexOf('@');
		int secondIndex= input.indexOf('.');
		
		//validation 1
		if ((input.contains("@")) && (input.contains("."))) {			
			validation1= true;
			//System.out.println("Validation 1 passes and mail ID contains '@' and '.'");
			
		}else {
			validation1= false;
			//System.out.println("Validation 1 fails and email not contains either '@' or '.'");
		}
		//validation2
		for(int i=0;i<len;i++) {				
			if (inputChar[i]=='@'){
				count1 ++;
			}
			if (input.charAt(i)=='.'){
				count2 ++;
			}			
		}
		
		if ((count1==1) && (count2 ==1)) {
			validation2 = true;
			//System.out.println("Validation 2 passes and mail ID contains '@' and '.' and not repeated");
		}else {
			validation2 = false;
			//System.out.println("Validation 2 fails and mail ID contains '@' and '.' is repeated or not available");
		}
		
		//validation 3
		//if ((firstIndex != -1) && (secondIndex!= -1)){
		if ((input.contains("@")) && (input.contains("."))) {
			String val= input.substring(firstIndex+1, secondIndex);
			//System.out.println("The value between '@' and '.' is: "+val);
			if (val.length() >= 4) {
				validation3 = true;
				//System.out.println("Validation 3 passes and atleast 4 characters are available between '@' and '.'");
			}else {
				validation3 = false;
				//System.out.println("Validation 3 fails and 4 characters are not available between '@' and '.'");
			}
		}else {
			validation3 = false;
			//System.out.println("Validation 3 fails and either '@' or '.' not available");
		}
		
		//validation 4
		if ((input.contains("@")) && (input.contains("."))) {
			String val1= input.substring(0, firstIndex);
			//System.out.println("The value before '@' is: "+val1);
			if (val1.length() >= 3) {
				validation4 = true;
				//System.out.println("Validation 4 passes and atleast 3 characters are available before '@'");
			}else {
				validation4 = false;
				//System.out.println("Validation 4 fails and 3 characters are not available before '@'");
			}
		}else{
			validation4 = false;
			//System.out.println("Validation 4 fails and either '@' or '.' not available");
		}
		//Validation 5
		if (input.endsWith(endValue)) {			
			validation5= true;
			//System.out.println("Validation 5 passes and mail ID ends with: "+ endValue);
		}else {
			validation5= false;
			//System.out.println("Validation 5 fails and email not ends with: "+ endValue);
		}
		
		if ((validation1) && (validation2) && (validation3) && (validation4)&& (validation5)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
			
		
		
	}

}
