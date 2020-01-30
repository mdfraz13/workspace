package com.java8.examples.features;

import java.text.DecimalFormat;

public class StringFormatExample {

	public static void main(String[] args) {
		String value = null;

		DecimalFormat df = new DecimalFormat("0.00");
		String result = value !=null ?  df.format(Double.parseDouble(value)) : null;
		System.out.println(result);

		int val = 481 +454+431+641 +469 +647 +681 +697 +468 +460 +476 +909 +565 +450 +523 +683 +644 +477 +460 +486 +479 +459 +487 +507 +440 +650 +628 +829 +606 +470 +648;
		System.out.println(val/31);
	}
}
