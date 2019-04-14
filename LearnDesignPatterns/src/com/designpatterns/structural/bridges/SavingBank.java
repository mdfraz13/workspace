package com.designpatterns.structural.bridges;

public class SavingBank implements Bank {
	
	private Loan loan = null;
	
	public SavingBank(Loan loan) {
		this.loan = loan;
	}

	@Override
	public void associateAccount() {
		System.out.println(" SavingBank ---- associateAccount()");
		loan.applyLoan();
	}

}
