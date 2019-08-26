package com.algorithims.programs.problems.hackerRank;

import java.util.Arrays;

public class MarsExploration {

	public static void main(String[] args) {
		String s = "SOSSPSSQSSOR";
		
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c != s.charAt(i%3)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
