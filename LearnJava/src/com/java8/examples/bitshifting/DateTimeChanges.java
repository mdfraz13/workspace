package com.java8.examples.bitshifting;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeChanges {

	public static void main(String[] args) {
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse("2020-01-19 10:42:28", formatter);
		System.out.println(dateTime.toString());

		final var zonedDateTime = LocalDateTime.parse("2020-01-19 10:42:28", formatter).atZone(ZoneId.systemDefault());
		LocalDateTime localDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime();
		System.out.println(localDateTime.toString());

		final var offsetDateTime = LocalDateTime.parse("2020-01-19 10:42:28", formatter).atZone(ZoneId.systemDefault()).toOffsetDateTime();
		System.out.println(offsetDateTime.toString());
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

		//Convert String to LocalDateTime
		String date = "2020-01-19 10:42:28";
		LocalDateTime ldt = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("LocalDateTime : " + format.format(ldt));

		//OffsetDateTime dateTimeWithOffset = Instant.parse(dateTime.toString()).atZone(ZoneId.systemDefault()).toOffsetDateTime();
		//System.out.println(dateTimeWithOffset);

		//Paris, 2016 Apr-Oct = DST, UTC+2, other months UTC+1
		//UTC+2
		ZonedDateTime parisDateTime = localDateTime.atZone(ZoneId.of("UTC"));
		System.out.println("Depart : " + format.format(parisDateTime));

		ZonedDateTime utcZoned = parisDateTime.withZoneSameInstant(ZoneId.of("UTC"));
		System.out.println(utcZoned.toString());

		// //hard code a zoneoffset like this, UTC-5
		// ZoneOffset nyOffSet = ZoneOffset.of("-05:00");
		// ZonedDateTime nyDateTime = parisDateTime.withZoneSameInstant(nyOffSet).plusHours(8).plusMinutes(10);
		// System.out.println("Arrive : " + format.format(nyDateTime));
		LocalDateTime s = strToDateTime("2018-09-30 15:10:00Z");
		LocalDateTimeToStr(s);

	}

	public static LocalDateTime strToDateTime(final String strDate){
		final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss'Z'");
		LocalDateTime dateTime2 = LocalDateTime.parse(strDate, formatter2);
		System.out.println(dateTime2.toString());
		return dateTime2;
	}

	public static void LocalDateTimeToStr(final LocalDateTime localDateTime){
		final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss'Z'");
		//LocalDateTime dateTime2 = LocalDateTime.parse(strDate, formatter2);
		//System.out.println(dateTime2.toString());
		String date = formatter2.format(localDateTime);
		System.out.println(date.toString());
	}

}
