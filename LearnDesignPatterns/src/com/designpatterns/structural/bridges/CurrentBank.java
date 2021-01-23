package com.designpatterns.structural.bridges;

public class CurrentBank implements Bank {

	private Loan loan = null;
	
	public CurrentBank(Loan loan) {
		this.loan = loan;
	}
	
	@Override
	public void associateAccount() {
		System.out.println(" CurrentBank ---- associateAccount()");
		loan.applyLoan();
	}

}
