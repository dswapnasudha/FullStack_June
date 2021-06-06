package com.training.qn05;

public class NumbsersSum {

	public static void main(String[] args) {
		String[] input1 = {"2AA","12","ABC","c1a"};
		int len=input1.length;
		int addDigits=0;
		System.out.println("The length of String array is:" +len);
		
		for(int i=0;i<len;i++) {
			String val = input1[i];
			System.out.println(val);
			for(int j=0;j<val.length();j++) {
				if (val.charAt(j)>='0' && val.charAt(j)<='9') {					
					System.out.println(val.charAt(j));
					int digits= Character.getNumericValue(val.charAt(j));
					//System.out.println(digits);
					addDigits = addDigits + digits;
				}
			}
			
		}
		System.out.println(addDigits);
	}

}
