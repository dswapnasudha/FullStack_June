package com.training.inheritence;

public class ICICIBank extends Bank{
	
	int id = 10;
	String name = "ICICI";

	@Override
	void processLoan() {
		System.out.println("I am processing a ICICI Bank Loan");
	}
	
	void withDrawCash() {
		System.out.println("I am withdrawing a cash from ICICI Bank");
	}
}
