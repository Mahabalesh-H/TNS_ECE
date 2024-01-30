package com.tns.day9.interfaces;

public class BankApplication{

	public static void main(String[] args) {
			 
		// Create a Bank instance
		Bank bank = new BankImpl();
		
		// Create an Account
		Account acc = new Account(123456, "Mihir", 155000, bank);
		acc.withdraw(123456, 5000);
	}

}
