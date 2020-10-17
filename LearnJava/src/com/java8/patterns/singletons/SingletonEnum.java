package com.java8.patterns.singletons;

public enum SingletonEnum
{
	SINGLETON_ENUM;

	public static SingletonEnum getInstance() {
		return SINGLETON_ENUM;
	}
}



