package com.java8.patterns.strategy;

public class StrategyClient {

	public static void main(String[] args) {
		PaymentStrategy paymentStrategy = new CreditCardPayment();
		ContextStrategy contextStrategy = new ContextStrategy(paymentStrategy);

		contextStrategy.execute();

		new ContextStrategy(() -> { System.out.println(" My Other Implementation ");}).execute();
	}
}
