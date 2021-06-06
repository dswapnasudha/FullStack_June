package com.training.qn04;

public class WordsCount {

	public static void main(String[] args) {
		String[] input1= {"aa","b","cc","ddd"};
		int input2 = 2;
		int count=0;
		int len=input1.length;
		System.out.println(len);
		for(int i=0;i<len;i++) {
			String val = input1[i];
			System.out.println(val);
			if (val.length() ==input2) {
				count++;
			}
		}
		System.out.println("The No of Words of the given length: "+input2+ " is: "+count );
	}

}
