package com.java8.problems;

import java.util.Arrays;

public class IntegerToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		String x = Integer.toBinaryString(13);
		//System.out.println(x);
		
		//int[] arr = {1,3,5,2,4,6,7};
		int[] arr = {4,3,1,2};
		
        for(int i=0;i<arr.length;i++){
        	int numberOfSwaps = 0;
        	for(int j=i;j<arr.length-1;j++) {
        		if(arr[i] > arr[j+1]){
                    int c = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = c;
                    numberOfSwaps++; 
                }
        	}
        	System.out.println(numberOfSwaps);
        }
        System.out.println(Arrays.toString(arr));
        //return numberOfSwaps;
        
		
	}

}
