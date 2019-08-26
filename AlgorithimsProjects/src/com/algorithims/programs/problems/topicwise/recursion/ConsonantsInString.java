package com.algorithims.programs.problems.topicwise.recursion;

public class ConsonantsInString {

	public static void main(String[] args) {
		String input = "geeksforgeeks portal";
		//System.out.println(consonantsItr(input));
		System.out.println(consonantRecursive(input));
	}
	
	private static int consonantsItr(String input) {
		int count = 0;
		for(char c : input.toCharArray()) {
			if(isConsonant(c))
				count ++;
		}
		return count;
	}
	
	private static boolean isConsonant(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
		return false;
	}
	
	private static int consonantRecursive(String input) {
		if(input!=null && input.length() == 0) return 0;
		System.out.println(input);
		return isConsonant(input.charAt(0)) ? 1 + consonantRecursive(input.substring(1)) : consonantRecursive(input.substring(1));
	}

}
