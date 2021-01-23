package com.java8.examples;

import static javax.xml.crypto.dsig.DigestMethod.SHA3_256;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Shah256String {

	public static void main(String[] args) throws  Exception{
		String strDate = "2018-09-30 15:10:00Z";
		strDate = strDate.substring(0,strDate.indexOf("Z"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
		LocalDateTime dateTime = LocalDateTime.parse(strDate, formatter);
		System.out.println(dateTime);

		// TimeZone tz = TimeZone.getTimeZone("UTC");
		// DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
		// df.setTimeZone(tz);
		// Date nowAsISO = df.parse(strDate); //df.format(strDate);
		// System.out.println(nowAsISO);

		LocalDateTime time = LocalDateTime.now();
		System.out.println(time.format(formatter)+"Z");
	}
}
