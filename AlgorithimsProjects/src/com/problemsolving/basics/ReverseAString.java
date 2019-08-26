package com.problemsolving.basics;

import java.util.Stack;

public class ReverseAString {

	public static void main(String[] args) {
		String input = "This is India";
		System.out.println(revereStringUsingStack(input));
		System.out.println(revereStringUsingSwap(input));
	}
	
	
	private static String revereStringUsingStack(String input) {
		String output = "";
		Stack<Character> chars = new Stack<Character>();
		for(char c : input.toCharArray()) {
			chars.push(c);
		}
		int i=0;
		char[] revered = new char[input.length()];
		while(!chars.isEmpty()) {
			revered[i++] = chars.pop();
		}
		return new String(revered);
	}
	
	private static String revereStringUsingSwap(String input) {
		//String output = "";
		char[] output = input.toCharArray();
		int l = 0,r = input.length()-1;
		while(l < r) {
			char temp = output[l];
			output[l] = output[r];
			output[r] = temp;
			l++;
			r--;
		}
		return new String(output);
	}
	
	/*
	 * private static String revereStringUsingRecursion(String input) { String
	 * output = ""; char[] r = input.toCharArray(); char x = r[0]; return
	 * revereStringUsingRecursion(); }
	 */

}
