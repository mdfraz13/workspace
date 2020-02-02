package com.problemsolving.basics.arraybased;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		int number = 1984;
		int result = 0;
		System.out.println(sumOfDigits(number,0));
	}
	
	private static int sumOfDigits(int number,int result) {
		if(number == 0) {
			return result;
		}
		
		int remainder = number % 10;
		number = number / 10;
		result = result +  remainder;
		return sumOfDigits(number,result);
	}

}
