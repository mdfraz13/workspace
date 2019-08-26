package com.algorithims.programs.problems.topicwise.recursion;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "GEEKSFORGEEKS";
		
		System.out.println(lengthUtil(input));
		
	}
	
	private static int lengthUtil(String input) {
		if(input.equals("")) return 0;
		return 1+lengthUtil(input.substring(1));
	}

}
