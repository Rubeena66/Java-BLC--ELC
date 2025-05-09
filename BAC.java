package com.BLC.ELC;

public class BAC {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setCarDetails("Rahul", 123456, 5000.0);
		bankAccount.getCarDetails();
	}
}