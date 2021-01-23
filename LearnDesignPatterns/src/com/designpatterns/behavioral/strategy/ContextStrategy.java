package com.designpatterns.behavioral.strategy;

public class ContextStrategy {
	
	private Strategy strategy = null;
	
	public ContextStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy() {
		return strategy.doOperation();
	}

}
