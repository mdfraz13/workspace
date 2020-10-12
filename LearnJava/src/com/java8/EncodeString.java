package com.java8;

import java.util.Base64;

public class EncodeString {

	public static void main(String[] args) {
		//String originalInput = "NUC|STCDCB@STG";
		String originalInputPROD = "NUC|STCDCB@PROD";
		String encodedString = Base64.getEncoder().encodeToString(originalInputPROD.getBytes());
		System.out.println(encodedString);

		String str = "TlVDfFNUQ0RDQkBTVEc=";
		if(encodedString.equalsIgnoreCase(str)){
			System.out.println(true);
		}

		String c = "".concat(" " + null);
	}
}
