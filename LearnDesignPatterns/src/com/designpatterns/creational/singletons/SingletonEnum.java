package com.designpatterns.creational.singletons;

public enum SingletonEnum {

	INSTANCE;
	
	public SingletonEnum getInstance() {
		return INSTANCE;
	}
	
}
