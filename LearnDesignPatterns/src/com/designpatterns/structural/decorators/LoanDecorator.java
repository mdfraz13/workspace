package com.designpatterns.structural.decorators;

public class LoanDecorator implements Loan {
	
	private Loan loan = null;
	public LoanDecorator(Loan c) {
		this.loan = c;
	}

	@Override
	public void applyLoan() {
		System.out.println("Loan Decorator....");
		if(loanValidator()) {
			System.out.println("Validation of Loan Successfull....");
			loan.applyLoan();
		}else {
			System.out.println("Validation of Loan failed....");
		}
	}
	
	private boolean loanValidator() {
		if (loan instanceof CarLoan) {
			return true;
		}
		return false;
	}

}
