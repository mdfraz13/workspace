package com.java8.examples.bitshifting;

import java.text.DecimalFormat;
import java.util.function.DoubleToLongFunction;

public class PriceFormatterExample {

	public static void main(String[] args) {
		final DecimalFormat priceFormatter = new DecimalFormat("0.00");
		Double d = 3.0;
		System.out.println(priceFormatter.format(d));

		Double d1 = null;
		System.out.println(priceFormatter.format(d1));

	}
}
