package com.java8;

import java.util.Base64;

public class EncodeString {

	public static void main(String[] args) {
		String originalInput = "NU0$@OW6";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		System.out.println(encodedString);


	}
}
