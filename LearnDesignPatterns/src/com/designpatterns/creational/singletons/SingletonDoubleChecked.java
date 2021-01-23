package com.designpatterns.creational.singletons;

public class SingletonDoubleChecked {
	
	private static volatile SingletonDoubleChecked INSTANCE;
	
	public static SingletonDoubleChecked getInstance() {
		if(INSTANCE==null) {
			synchronized (SingletonDoubleChecked.class) {
				if(INSTANCE==null) {
					return INSTANCE;
				}
			}
		}
		
		return INSTANCE;
	}

}
