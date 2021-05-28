package com.datastructure.arrays;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input = -121;
		String x = String.valueOf(input);
		System.out.println(x);
		
		int firstIndex = 0;
		int lastIndex = x.length() - 1;
		
		
		while (firstIndex < lastIndex) {
			if(x.charAt(firstIndex) != x.charAt(lastIndex)) {
				System.out.println("FALSE");
				return;
			}
			
			firstIndex++;
			lastIndex--;
		}
		
		System.out.println("TRUE");
	}

}
