package com.java8.examples.bitshifting;

public class BitShiftDataTypes {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		long d = Integer.MAX_VALUE + Integer.MAX_VALUE;
		long b = a << 1;
		long c = a << 2;

		System.out.println(a +" --- "+ b + " -- " +c+ " d= "+d);
	}
}
