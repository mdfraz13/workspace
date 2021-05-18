package com.datastructure.arrays;

import java.util.HashMap;

public class RomanToInteger {
	
	/*
	 * I             1
V             5
X             10
L             50
C             100
D             500
M             1000
	 * 
	 */
	public static void main(String[] args) {
		String input = "MCMXCIV";
		final var romanValue = new HashMap<Character, Integer>(); 
		romanValue.put('I', 1);
		romanValue.put('V', 5);
		romanValue.put('X', 10);
		romanValue.put('L', 50);
		romanValue.put('C', 100);
		romanValue.put('D', 500);
		romanValue.put('M', 1000);
		
		int totalValue = 0;
		for (int i = 0; i < input.length(); i++) {
			final var character = input.charAt(i);
			int current = romanValue.get(character);
			if (i > 0) 
			{
				int previousElement = romanValue.get(input.charAt(i - 1));
				if (current > previousElement) {
					totalValue += (current - 2 * previousElement);
				}
				else {
					totalValue += current;
				}
			}
			else 
			{
				totalValue += current;
			}
			System.out.println(totalValue);
		}
		
		System.out.println(totalValue);
	}

}
