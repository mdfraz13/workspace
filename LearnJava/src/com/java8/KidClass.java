package com.java8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class KidClass {

	public static void main(String[] args) {
		// String xyz = "Test\t";
		// System.out.println(xyz);
		// xyz = xyz.trim();
		// //xyz = xyz.replaceAll("\\r\\n\\t","");
		// System.out.println(xyz);

		//final String calculatedPrice = "1.89";
		// final String chargePrice = new BigDecimal(calculatedPrice)
		// 	.setScale(2, RoundingMode.DOWN)
		// 	.toString();
		// System.out.println(chargePrice);

		Double calculatedPrice  = 12.0;
		final String chargePrice2 = new DecimalFormat("#0.00").format(calculatedPrice);
		System.out.println(chargePrice2);
	}

	private String calculatePrice(final String price, final String multiplier)
	{
		return new BigDecimal(price)
			.setScale(2, RoundingMode.DOWN)
			.multiply(new BigDecimal(multiplier))
			.toBigIntegerExact()
			.toString();
	}
}
