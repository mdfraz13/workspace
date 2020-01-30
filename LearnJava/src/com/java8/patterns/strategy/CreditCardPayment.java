package com.java8.patterns.strategy;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Payment Through Credit Card");
	}
}
