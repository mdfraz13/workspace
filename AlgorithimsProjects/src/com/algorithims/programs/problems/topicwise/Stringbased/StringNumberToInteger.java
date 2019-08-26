package com.algorithims.programs.problems.topicwise.Stringbased;

public class StringNumberToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "24";
		int value = 0;
		int len = number.length();
		for(int x=0;x<len;x++) {
			char ch = number.charAt(x);
			value += value<< 3 ;
			System.out.println(value);
			value += value << 1;
			System.out.println(value);		
			value += (ch - '0'); 
			System.out.println(value);
		}
		System.out.println(value);
	}

}
