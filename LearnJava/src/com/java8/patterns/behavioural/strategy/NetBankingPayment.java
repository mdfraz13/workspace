package com.java8.patterns.behavioural.strategy;

public class NetBankingPayment implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Netbanking payment...");
	}
}
