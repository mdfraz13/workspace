package com.java8;

import java.util.Arrays;
import java.util.List;

public class PackageNameLogic {

	public static void main(String[] args) {
		List<String> subscriptionGuIds = Arrays.asList("TEST","TEST2", "TEST3");

		final var packageNames = new StringBuffer();
		int count = subscriptionGuIds.size() - 1;
		if(count == 0){
			System.out.println(subscriptionGuIds.get(0));
		}else {
			for (final var packageName : subscriptionGuIds) {
				packageNames.append(packageName);
				if (--count > 0) {
					packageNames.append(",");
				} else if(count == 0) {
					packageNames.append(" & ");
				}
			}
		}
		System.out.println(packageNames.toString());
	}
}
