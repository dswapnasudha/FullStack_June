package com.training.qn39;

public class Account {
	
	private String accountNumber;
	private int balance;
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	/*
	 * public void setBalance(int balance) { this.balance = balance; }
	 */
	
	public void deposit(int transactionAmount) {
		int balanceAmount = getBalance();
		balanceAmount += transactionAmount;
		System.out.println("Your balance after the transaction is: "+ balanceAmount);
	}
	
	public void withDraw(int transactionAmount) {
		int balanceAmount = getBalance();
		balanceAmount = balanceAmount - transactionAmount;
		System.out.println("Your balance after the transaction is: "+ balanceAmount);
		
		if (balanceAmount<0) {
			balanceAmount = getBalance();
			System.out.println("Insufficient Balance Your balance after the transaction is:" + balanceAmount);
		}
		 
	}
	
	
	public static void main(String[] args) {
		Account account = new Account("1000321",5000);
		account.deposit(1000);
		account.withDraw(1000);
		account.withDraw(10000);
		
	}
}
