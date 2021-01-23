package com.designpatterns.structural.decorators;

public class CarLoan implements Loan {

	@Override
	public void applyLoan() {
		System.out.println("Applying for Car Loan....");
	}

}
