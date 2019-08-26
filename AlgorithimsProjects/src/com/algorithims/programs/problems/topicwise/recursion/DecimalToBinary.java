package com.algorithims.programs.problems.topicwise.recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		int input = 10;
		//String result = "";
		//System.out.println(DecimalToBinary(input, result));
		System.out.println(DecimalToBinary2(input));
	}
	
	public static String DecimalToBinary(int input,String result) {
		
		if(input == 0) return result;
		
		 int x = input%2;
		 input = input/2;
		 //result = DecimalToBinary(input, result+x);
		
		return DecimalToBinary(input, result+x);
	}
	
	public static int DecimalToBinary2(int input) {
		if(input == 0) return input;
		
		return input%2 + 10*DecimalToBinary2(input/2);
	}

}
