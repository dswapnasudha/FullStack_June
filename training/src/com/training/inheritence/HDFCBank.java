package com.training.inheritence;

public class HDFCBank extends Bank{
	
	int id = 10;
	String name = "HDFC";

	@Override
	void processLoan() {
		System.out.println("I am processing a HDFC Bank Loan");
	}
	
	void withDrawCash() {
		System.out.println("I am withdrawing a cash from HDFC Bank");
	}
}
