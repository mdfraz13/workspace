package com.designpatterns.behavioral.strategy;

public class StrategyClient {

	public static void main(String[] args) {
		Strategy strategy = new AddOperation(10,20);
		ContextStrategy context = new ContextStrategy(strategy);
		System.out.println(context.executeStrategy());
		
		Strategy strategy2 = new MultiplyOperation(10,20);
		ContextStrategy context2 = new ContextStrategy(strategy2);
		System.out.println(context2.executeStrategy());
	}

}
