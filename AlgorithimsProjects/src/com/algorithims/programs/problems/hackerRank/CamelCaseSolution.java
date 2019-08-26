package com.algorithims.programs.problems.hackerRank;

public class CamelCaseSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "saveTheChanges";
		
		int wordcount = 1;
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				wordcount++;
			}
		}
		System.out.println(wordcount);
	}

}
