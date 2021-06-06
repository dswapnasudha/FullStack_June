package com.training.qn06;

public class ConvertArray {

	public static void main(String[] args) {
		String[] input= {"Vikas","Lokesh","Ashok"};
		String str = "";
		int len=input.length;
		System.out.println("The length of string array is:" +len);
		for(int i=0;i<len;i++) {			
			if (i==len-1) {
				str=str+input[i];
			}else {
				str=str+input[i]+",";
			}
		}
		System.out.println("The String Array converted to string is: "+ str);
	}

}
