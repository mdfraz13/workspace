package com.algorithims.programs.problems.topicwise.Stringbased;

import java.util.Arrays;

public class ReturnMaximumOccuringCharacterInString {

	public static void main(String[] args) {
		String input = "ABCDB";
		char[] ch = input.toCharArray();
		int[] count = new int[256];
		
		
		for(int i =0;i<input.length();i++) {
			System.out.print(" "+ch[i]);
			count[ch[i]]++;
		}
		
		int max = 0;
		char result = 0;
		for(int i=0;i<input.length();i++) {
			if(max < count[ch[i]]) {
				max = count[ch[i]];
				result = ch[i];
			}
		}
		
		System.out.println("----->Max="+max+" ---["+result+"]");
	}
	
	

}
