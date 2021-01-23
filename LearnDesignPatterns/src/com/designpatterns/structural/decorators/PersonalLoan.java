package com.designpatterns.structural.decorators;

public class PersonalLoan implements Loan {

	@Override
	public void applyLoan() {
		System.out.println("Appling for Personal Loan.....");
	}

}
