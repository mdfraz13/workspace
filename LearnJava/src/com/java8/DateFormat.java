package com.java8;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;
import javax.crypto.Mac;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Formatter;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class DateFormat {

	public static void main(String[] args) {
		//formattedDateTime(date, TimeZone.getTimeZone("GMT").toZoneId())
		Date date = new Date();
		// val formatter = SimpleDateFormat(STC_DATETIME_PATTERN);
		// formatter.timeZone = TimeZone.getTimeZone(zoneId);
		// formatter.isLenient = false;
		// return formatter.format(date);
		final String STC_DATETIME_PATTERN = "EEE, d MMM YYYY HH:mm:ss ";
		SimpleDateFormat formatter = new SimpleDateFormat(STC_DATETIME_PATTERN);
		formatter.setTimeZone(TimeZone.getTimeZone(TimeZone.getTimeZone("GMT").toZoneId()));
		formatter.setLenient(false);

		String newDate = formatter.format(date)+"GMT";
		System.out.println(newDate);

		try {
			System.out.println(calculateRFC2104HMAC("Thu, 3 Oct 2019 07:09:27 GMT"));
		} catch (SignatureException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}
	}

	private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
	private static String KEY = "sNeesK371";
	//val keySpec = SecretKeySpec(KEY.toByteArray(), "HmacSHA1")

	public static String calculateRFC2104HMAC(String data)
		throws SignatureException, NoSuchAlgorithmException, InvalidKeyException
	{
		SecretKeySpec signingKey = new SecretKeySpec(KEY.getBytes(), HMAC_SHA1_ALGORITHM);
		Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
		mac.init(signingKey);
		byte[] result  = mac.doFinal(data.getBytes());
		byte[] ss = Base64.getEncoder().encode(result);
		return new String(ss);
	}
}
