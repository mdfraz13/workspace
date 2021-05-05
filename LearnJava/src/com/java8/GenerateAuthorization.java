package com.java8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GenerateAuthorization {

    public static void main(String[] args) {

        final var clientIdSecretKey = "AlnBUfBfIFfAugGnqmASshmpGqAZNYxHkmP0ARo" + ":" + "TaRGVRoyOGSgkIhCjj6FX6UBORs8mnmLLDSqr";
        final var authorization = new String(
                Base64.getEncoder().encode(clientIdSecretKey.getBytes(StandardCharsets.UTF_8)));
        System.out.println(authorization);
    }
}
