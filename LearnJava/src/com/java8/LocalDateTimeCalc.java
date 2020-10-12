package com.java8;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeCalc {

	public static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	// yyyy-MM-dd'T'HH:mm:ss'Z'
	//final var chargeResult = new ChargeResult(
	public static final DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

	public static void main(String[] args) {
		//final var localTime = LocalDateTime.parse("2020-07-20T16:50:25.518Z", dateFormatter);
		final var localTime = LocalDateTime.now().format(dateFormatter);
		System.out.println(LocalDateTime.now());

		System.out.println(localTime);

		//final var strDate = dateFormatter.format(localTime);
		//System.out.println(strDate);

		// System.out.println(ZoneOffset.systemDefault());
		// final var  utcTimeZone = localTime.atZone(ZoneId.of("Asia/Dubai")).withZoneSameInstant(ZoneOffset.UTC);
		// System.out.println(utcTimeZone.toLocalDateTime());
		//
		// final var  utcTime = localTime.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
		// //final var utcTime = localTime.atZone(ZoneId.of("UTC"));
		//
		// System.out.println(utcTime);
	}
}
