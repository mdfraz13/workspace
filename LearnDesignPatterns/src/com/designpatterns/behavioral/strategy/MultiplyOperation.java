package com.designpatterns.behavioral.strategy;

public class MultiplyOperation implements Strategy {

	private int num1;
	private int num2;
	
	public MultiplyOperation(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public int doOperation() {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

}
