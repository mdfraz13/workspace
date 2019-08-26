package com.algorithims.programs.problems.topicwise.Stringbased;

import java.util.Arrays;

public class ReverseAStringUsingSwap {

	public static void main(String[] args) {
		String input = "abbcd";
		System.out.println(reverse(input));
	}
	
	private static String reverse(String input) {
		String reversed = "";
		int r = input.length() -1,l=0;
		
		char[] ip = input.toCharArray();
		while(l < r ) {
			char tmp  = ip[r];
			ip[r] = ip[l];
			ip[l] = tmp;
			l++;
			r--;
		}
		
		reversed = Arrays.toString(ip);

		return reversed;
	}

	
	
}
