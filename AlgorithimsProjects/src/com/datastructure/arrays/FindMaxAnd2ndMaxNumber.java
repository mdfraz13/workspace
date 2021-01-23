package com.datastructure.arrays;

public class FindMaxAnd2ndMaxNumber {

	public static void main(String[] args) {
		//int[] input = {3, 8, 5, 2, 6, 9, 1, 4};
		int[] input = {9, 8, 5, 2, 6, 1, 4};
		//System.out.println("0000");
		getMaxAnd2ndMax2(input);
		//getMaxAnd2ndMax(input);
	}


	public static void getMaxAnd2ndMax(int[] input){
		int maxNumber = Integer.MIN_VALUE;
		int max2Number = Integer.MIN_VALUE;

		for(int i=0; i< input.length;i++) {

			if (maxNumber < input[i]) {
				maxNumber = input[i];
			}
		}
		System.out.println(maxNumber);
		for(int i=0; i< input.length;i++) {
			if((max2Number < input[i]) && (input[i] < maxNumber)){
				System.out.println(input[i]);
				max2Number = input[i];
			}
		}
		System.out.println(max2Number);
		System.out.println(maxNumber+" == "+max2Number);
	}

	public static void getMaxAnd2ndMax2(int[] input){
		int firstMaxNumber = Integer.MIN_VALUE;
		int secondMaxNumber = Integer.MIN_VALUE;
		for(int i=0; i< input.length;i++) {
			if(firstMaxNumber < input[i]){
				secondMaxNumber = firstMaxNumber;
				firstMaxNumber = input[i];
			}

			else if(secondMaxNumber < input[i]){
				secondMaxNumber = input[i];
			}
		}
		System.out.println(firstMaxNumber+" == "+secondMaxNumber);

	}

	public static void getMaxAnd2ndMax2QA(int[] input){
		int firstMaxNumber = input[0];
		int secondMaxNumber = input[1];
		for(int i=1; i< input.length + 1; i++) {
			if(firstMaxNumber < input[i]){
				secondMaxNumber = firstMaxNumber;
				firstMaxNumber = input[i];
			}

			else if(secondMaxNumber <= input[i]){
				secondMaxNumber = input[i];
			}
		}
		System.out.println(firstMaxNumber+" == "+secondMaxNumber);
	}

	public static void data(int arr[], int arr_size) {
		int i, num1, num2;
		num1 = num2 = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++)
		{
			if (arr[i] > num1) {
				num2 = num1;
				num1 = arr[i];
			}
			else if (arr[i] > num2 && arr[i] != num1) {
				num2 = arr[i];
			}
		}
		System.out.println("num1 "+num1+" num2 "+num2);
	}
}
