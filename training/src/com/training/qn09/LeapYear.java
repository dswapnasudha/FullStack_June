package com.training.qn09;

public class LeapYear {

	public static void main(String[] args) {
		int year=2021;
		boolean leap=false;
		
		if (((year % 4==0) && (year %100 != 0)) || (year%400 ==0)){
			leap = true;
		}
		
		if (leap) {
			System.out.println("The given Year is Leap Year");
		}else {
			System.out.println("Given year is not a leap year");
		}
	}

}
