package com.java8.patterns.strategy;

public class ContextStrategy {
	private PaymentStrategy paymentStrategy;

	public ContextStrategy(PaymentStrategy paymentStrategy){
		this.paymentStrategy = paymentStrategy;
	}

	public void execute(){
		paymentStrategy.pay();
	}
}
