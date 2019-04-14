package com.designpatterns.structural.decorators;

public class DecoratorClient {

	public static void main(String[] args) {
		//Loan loan = new CarLoan();
		Loan loan = new PersonalLoan();
		LoanDecorator s = new LoanDecorator(loan);
		s.applyLoan();
	}

}
