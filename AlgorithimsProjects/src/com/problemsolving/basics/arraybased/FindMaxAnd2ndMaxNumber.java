package com.problemsolving.basics.arraybased;

public class FindMaxAnd2ndMaxNumber {

	public static void main(String[] args) {
		int[] input = {3, 8, 5, 2, 6, 9, 1, 4};
		//System.out.println("0000");
		getMaxAnd2ndMax2(input);
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
		}
		System.out.println(firstMaxNumber+" == "+secondMaxNumber);

	}
}
