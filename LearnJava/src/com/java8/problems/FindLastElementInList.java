package com.java8.problems;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindLastElementInList {

	public static void main(String[] args) {
		int[] input = {12,1,3,46,7,212,121,90,89};

		final var servicePrice = Double.parseDouble("9.50");
		final var schedDays = 720 / 24;

		System.out.println(schedDays);

		LocalDateTime from = LocalDateTime.now();
		//LocalDateTime to = LocalDateTime.now().plusDays(7);
		String time1 = "2020-03-18T09:48:23.558";
		// convert String to LocalDateTime
		LocalDateTime to = LocalDateTime.parse(time1);


		double remainingNoOfDaysForAddonCharging = ((((Duration.between(from, to).getSeconds()) / 60) / 60) / 24.0);
		System.out.println(Math.ceil(remainingNoOfDaysForAddonCharging));

		System.out.println(remainingNoOfDaysForAddonCharging);
		final Double calculatedPrice = remainingNoOfDaysForAddonCharging * (servicePrice / schedDays) ;
		System.out.println(calculatedPrice);
	}

}
