package com.java8;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class GenerateSignatureIntigral {

    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException {


        var propertiesMap = new HashMap<String, String>();
        propertiesMap.put("txRef", "txRef");
        propertiesMap.put("msisdn", "msisdn");
        propertiesMap.put("acr", "acr");
        propertiesMap.put("keyword", "keyword");
        propertiesMap.put("subscriptionType", "0");
        propertiesMap.put("eventTs", "1591617805481");

// SubscriptionGuid Order by Alphabetically
        final String[] subscriptionGuidArray = {"FIGHT_SUBSCRIPTION", "BASE_SUBSCRIPTION"};
        final var subscriptionGuids = Arrays.stream(subscriptionGuidArray)
                .sorted()
                .collect(Collectors.joining("|"));

        propertiesMap.put("subscriptionGuids", subscriptionGuids);

// Additional details for security
// Url endpoint starting after hostname
        propertiesMap.put("urlEndpoint", "/jawwy/partnerKey/v1/user/package/subscription");
// present in request header as Version: v1
        propertiesMap.put("headerVersion", "v1");
// present in request header as Timestamp: <yyyy-MM-dd HH:mm:ss>
        propertiesMap.put("headerTimestamp", "2020-06-28 06:22:00");

        propertiesMap = propertiesMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));


        final var requestString = propertiesMap
                .entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.joining());

        System.out.println(requestString);

        String requestString1 = "acr=1612789016957eventTs=1613289251804headerTimestamp=2021-02-14 10:54:11headerVersion=v1msisdn=966552696933subscriptionGuids=BASE_SUBSCRIPTIONsubscriptionType=0txRef=ba5c92af-abc2-4043-8e93-dd75ee6e48eaurlEndpoint=/jawwy/wn7bg9a2ha6dovw3mv7dexvc1lw3x4bxadhhdvfpzb51/v1/user/package/subscription";

        //System.out.println(calculateSignature("cb5b7387-34cd-4c5b-80bf-a1477ff7f277", requestString));
        System.out.println(calculateSignature("TlVDfFNUQ0RDQkBTVEc=", requestString1));

    }

	public static String calculateSignature(String sharedSecretKey, String message)
			throws NoSuchAlgorithmException, InvalidKeyException
	{
		final var hasher = Mac.getInstance("HmacSHA256");
		hasher.init(new SecretKeySpec(sharedSecretKey.getBytes(), "HmacSHA256"));
		final var hash = hasher.doFinal(message.getBytes());
		return Hex.encodeHexString(hash);
	}

}
