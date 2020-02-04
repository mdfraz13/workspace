package com.datastructure.stringsbased;

public class ReverseStringUsingRecursion {
	
	public static void main(String[] args) {
		String input = "India";
		String output = reverseString(input);
		System.out.println(output);
	}
	
	private static String reverseString(String s) {
		char[] output = new char[s.length()];
		reverseStringUtil(s.toCharArray(),output ,0,s.length()-1);
		return new String(output);
	}
	
	private static void reverseStringUtil(char[] arr,char[] output ,int start,int end) {
		if(start == arr.length) return;
		output[start] = arr[end];
		reverseStringUtil(arr,output, start+1, end-1);
	}

}
