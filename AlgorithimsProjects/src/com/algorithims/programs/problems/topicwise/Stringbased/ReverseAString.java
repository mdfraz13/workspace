package com.algorithims.programs.problems.topicwise.Stringbased;

import java.util.Stack;

public class ReverseAString {

	public static void main(String[] args) {
		String input = "ViratKohli";
		//System.out.println(reverseWithStack(input.toCharArray()));
		System.out.println(reverseWithRec(input));
			
	}
	
	private static String reverseWithStack(char[] arr) {
		Stack<Character> stk = new Stack<Character>();
		String reversed = "";
		for(Character c : arr) {
			stk.add(c);
		}
		while(!stk.isEmpty()) {
			reversed += stk.pop();
		}
			
		return reversed;
	}
	
	private static String reverseWithRec(String input) {
		String reversed = "";
		int n = input.length();
		reverseUtil(input,0,n,reversed);
		System.out.println(reversed);
		return reversed;
	}
	
	private static void reverseUtil(String input,int i,int n,String reversed) {
		
	}

}
