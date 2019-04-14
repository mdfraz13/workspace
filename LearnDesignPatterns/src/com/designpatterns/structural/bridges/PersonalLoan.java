package com.designpatterns.structural.bridges;

public class PersonalLoan implements Loan {

	@Override
	public void applyLoan() {
		System.out.println("Appling for Personal Loan.....");
	}

}
