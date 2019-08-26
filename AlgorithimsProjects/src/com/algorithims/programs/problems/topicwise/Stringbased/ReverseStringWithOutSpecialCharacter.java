package com.algorithims.programs.problems.topicwise.Stringbased;

import java.util.Arrays;

public class ReverseStringWithOutSpecialCharacter {

	public static void main(String[] args) {
		String input1 = "a,b$c"; // c,b$a
		String input2 = "a!!!b.c.d,e'f,ghi"; // i!!!hg.f.e.d,...
		
		reverse(input1);
		reverse(input2);
	}
	
	private static String reverse(String input) {
		String reversed = "";
		char[] ip1 = input.toCharArray();
		int l = 0,r=ip1.length-1;
		
		while(l < r) {
			if(!isAlphabet(ip1[l])) {
				l++;
			}else if(!isAlphabet(ip1[l])) {
				r--;
			}else {
				char tmp  = ip1[r];
				ip1[r] = ip1[l];
				ip1[l] = tmp;
				l++;
				r--;
			}
		}
		reversed = Arrays.toString(ip1);
		System.out.println(reversed);
		
		return reversed;
	}
	
	private static boolean isAlphabet(char x) {
		return (x >='a' && x <='z') || (x >='A' && x <='Z');
	}

}
