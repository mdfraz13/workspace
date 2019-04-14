package com.designpatterns.structural.bridges;

public class CarLoan implements Loan {

	@Override
	public void applyLoan() {
		System.out.println("Applying for Car Loan....");
	}

}
