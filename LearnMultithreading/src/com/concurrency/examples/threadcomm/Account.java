package com.concurrency.examples.threadcomm;

public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	private volatile int totalMoney = 1000;
	
	public synchronized void withDrawMoney(int value)
	{
		totalMoney -= value;
	}

	
	public synchronized void DepositMoney(int value) {
		totalMoney += value;
	}
	
	public int getBalance() {
		return totalMoney;
	}
}
