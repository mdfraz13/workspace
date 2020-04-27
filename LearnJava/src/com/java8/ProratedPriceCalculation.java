package com.java8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDateTime;

public class ProratedPriceCalculation {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime mo = LocalDateTime.now().plusHours(719).plusMinutes(59);
		//LocalDateTime week = LocalDateTime.now().plusDays(7);
		double price = calculateProratedPrice(now, mo);

		System.out.println("******************************");

		//calculateProratedPrice2(now, mo);
		calculateProratedPrice();

		double total = 0.00;
		if(total > 0){
			System.out.println("total is greater");
		}else{
			System.out.println("total is equal");
		}
	}

	public static double calculateProratedPrice(final LocalDateTime from,
												final LocalDateTime to) {
		final var servicePrice = 9.50;
		final var schedDays = 720 / 24;
		System.out.println("schedDays = "+schedDays);
		final double remainingNoOfDaysForAddonCharging = ((((Duration.between(from, to).getSeconds()) / 60.0) / 60.0) / 24.0);
		System.out.println("remainingNoOfDaysForAddonCharging="+remainingNoOfDaysForAddonCharging);
		final double calculatedPrice = (remainingNoOfDaysForAddonCharging * servicePrice) / schedDays ;
		System.out.println("calculatedPrice="+calculatedPrice);
		double roundOff = Math.round(calculatedPrice*100.0)/100.0;
		System.out.println("roundOff="+roundOff);
		return calculatedPrice;
	}

	public static double calculateProratedPrice2(final LocalDateTime from,
												final LocalDateTime to) {
		final var servicePrice = 9.50;
		final var schedDays = 720 / 24;
		System.out.println("schedDays = "+schedDays);
		final double remainingNoOfDaysForAddonCharging = ((((Duration.between(from, to).getSeconds()) / 60.0) / 60.0) / 24.0);
		System.out.println("remainingNoOfDaysForAddonCharging="+remainingNoOfDaysForAddonCharging);
		final double calculatedPrice = remainingNoOfDaysForAddonCharging * (servicePrice / schedDays) ;
		System.out.println("calculatedPrice="+calculatedPrice);
		double roundOff = Math.round(calculatedPrice*100.0)/100.0;
		System.out.println("roundOff="+roundOff);
		return calculatedPrice;
	}

	public static void calculateProratedPrice(){
		double price = 20;
		final var perDayPrice = new BigDecimal(price).setScale(2, RoundingMode.DOWN)
													 .divide(new BigDecimal(30)
													 .setScale(2, RoundingMode.DOWN),2, RoundingMode.HALF_EVEN)
													 .toString();

		System.out.println("=====>>>>>>>>>"+perDayPrice);
	}

}
