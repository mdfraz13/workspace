package com.problemsolving.basics.arraybased;

public class ArithmeticProblems {

	public static void main(String[] args) {
		int input = 10;
		System.out.println("IsPrime "+ isPrime(input, 2));

		System.out.println("Factorial value " + factorial(input));

		print_fabonici_series(input, 0, 1);
		System.out.println("");
		System.out.println("Sum of Number " + sumOfNumbersUpto(input, 0));
	}

	private static boolean isPrime(int num, int p){
		if(p == num) return true;
		if(p > num) return false;
		if(num % p == 0) return false;

		return isPrime(num , ++p);
	}

	private static int factorial(int num){
		if(num == 1) return 1;

		return num * factorial(num - 1);
	}

	private static void print_fabonici_series(int num, int first , int second){
		if(num-- == 0) return;

		int temp = first + second;
		first = second;
		second = temp;
		System.out.print(" "+first);
		print_fabonici_series(num,first,second );
	}

	private static int sumOfNumbersUpto(int num, int sum){
		if(num == 0) return sum;
		sum = sum + num;
		return sumOfNumbersUpto(--num, sum);
	}

}
