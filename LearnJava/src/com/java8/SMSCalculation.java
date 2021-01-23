package com.java8;

import static javax.xml.crypto.dsig.SignatureMethod.HMAC_SHA256;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class SMSCalculation {

	public static void main(String[] args) {
		final String value = "Dear customer, your Jawwy TV subscription is now active. " +
							 "" +
							 "Please use the below account details and start enjoying non-stop entertainment." +
							 "" +
							 "" +
							 "" +
							 " Username: 201063721848" +
							 "" +
							 "" +
							 " Please use previous password or reset it from the app. \n\n Website: \n\n https://web.jawwy.tv/en \\\\n \\n Download app: \\n http://dl.jawwy.tv";
		System.out.println(value);

		final String arabictxt = "عميلنا العزيز، تم تفعيل اشتراكك في Jawwy TV بنجاح. تقدر تستخدم بيانات تسجيل الدخول المذكورة عشان تستمتع بتجربة من الترفيه المتواصل.  \\\\n\\\\n" +
								 "اسم المستخدم: {username}\\\\n\\\\n  " +
								 "ونفس كلمة المرور القديمة، ولو نسيتها ميهمكش، تقدر تغيّرها من التطبيق. \n" +
								// "\\\\\\\\n \\\\\\\\n\n" +
								 "الموقع الإلكتروني:\n" +
								 "\\\\\\\\n\n" +
								 "https://web.jawwy.tv/\n" +
								 "\\\\\\\\n \\\\\\\\n\n" +
								 " حمّل التطبيق: \n" +
								 "\\\\\\\\n\n" +
								 "http://dl.jawwy.tv\n";

		final var txx2 = arabictxt.replace("\n\r", "");
		System.out.println(txx2);

		final var txt = value.replace("\n\r","");
		System.out.println(txt);
	}



}
