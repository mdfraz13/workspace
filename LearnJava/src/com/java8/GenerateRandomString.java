package com.java8;

import java.util.UUID;

public class GenerateRandomString {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);

		//final String _48CharacterStr = RandomStringUtils.randomAlphanumeric(44);
		//System.out.println(_48CharacterStr.toLowerCase());
	}
}
