package com.training.oops;

public class Banking {

	public void login(int userId,String password) {
		System.out.println("logging using userID");
	}
	
	public void login(long mobileNumber) {
		System.out.println("logging using mobile");
	}
	
	public static void main(String[] args) {
		Banking bank = new Banking();
		bank.login(1234567890);
		bank.login(555, "value");
	}

}
