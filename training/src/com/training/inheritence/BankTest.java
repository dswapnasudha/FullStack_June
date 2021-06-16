package com.training.inheritence;

public class BankTest {

	public static void main(String[] args) {
		System.out.println("Bank");
		Bank bank = new Bank();
		System.out.println(bank.id);
		System.out.println(bank.name);
		bank.processLoan();
		System.out.println("HDFC Bank");
//		HDFCBank hdfc = new HDFCBank();
		Bank hdfc = new HDFCBank();
		System.out.println(hdfc.id);
		System.out.println(hdfc.name);
		hdfc.processLoan();
//		scienceBook.buy();
		System.out.println("ICICI Bank");
//		ICICIBank icici = new ICICIBank();
		Bank icici = new ICICIBank();
		System.out.println(icici.id);
		System.out.println(icici.name);
		icici.processLoan();
		//icici.withDrawCash();

	}

}
