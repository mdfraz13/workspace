package com.datastructure;

/**
 * Write a program in Java which Counts total number of Characters, Words and Lines
 * @author Faraz
 *
 */
public class Problem1 {

	public static void main(String[] args) {
		String s = "The is indian boy writing the code ";
		String[] wordsCount = s.split(" ");
		char[] charCounts = s.toCharArray();
		
		System.out.println("Words="+wordsCount.length);
		System.out.println("Character Count="+charCounts.length);
	}

}
