package com.java8;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PrepareAuthorization {

	private static final MessageDigest SHA256_DIGEST;
	private static final long epochTs = 34234242342L;

	public static void main(String[] args) {
		final var clientId     = "";
		final var clientSecret = "";
		final var inputStr     = clientId + ":" + clientSecret + ":" + epochTs;
		final var hash         = SHA256_DIGEST.digest(inputStr.getBytes(StandardCharsets.UTF_8));
		
	}

	static {
		try {
			SHA256_DIGEST = MessageDigest.getInstance("SHA-256");
		}
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
}
