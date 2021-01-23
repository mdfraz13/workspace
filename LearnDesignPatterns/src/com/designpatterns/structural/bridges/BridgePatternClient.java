package com.designpatterns.structural.bridges;

public class BridgePatternClient {

	public static void main(String[] args) {
		Loan loan = new PersonalLoan();
		Bank bank = new SavingBank(loan);
		
		bank.associateAccount();
	}

}
