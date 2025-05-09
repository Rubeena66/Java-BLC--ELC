package com.BLC.ELC;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;

	public void setCarDetails(String holder, int accNum, double bal) {
		accountHolder = holder;
		accountNumber = accNum;
		balance = bal;
	}

	public void getCarDetails(){
		System.out.println("Account Holder:" + accountHolder);
		System.out.println("Account Number:" + accountNumber);
	    System.out.println("Balance       :" + balance);
	}
}