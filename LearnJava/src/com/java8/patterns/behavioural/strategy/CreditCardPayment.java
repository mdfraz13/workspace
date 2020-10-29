package com.java8.patterns.behavioural.strategy;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Payment Through Credit Card");
	}
}
