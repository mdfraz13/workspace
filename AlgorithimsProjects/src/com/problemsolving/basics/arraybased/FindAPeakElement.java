package com.problemsolving.basics.arraybased;

public class FindAPeakElement {

	/**
	 * Corner :
	 * If sorted in asc - last element is peak
	 * if sorted in desc - first element is peak
	 *
	 * else
	 * 	higher than neighbours
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {10, 20, 15, 2, 23, 90, 67};
		// int[] a = {1, 2, 3, 5, 9};
		//int[] a = {19, 8, 7, 5, 1};
		int peakElement = getPeakElement(a);
		System.out.println(peakElement);
	}

	public static int getPeakElement(int[] a){
		int peak = a[0];
		for(int i=1;i< a.length; i++){

			if(a[i-1] > peak && a[i+1] < peak){
				peak = a[i];
			}else if(a[i] > peak){
				peak = a[i];
			}
		}

		return peak;
	}
}
