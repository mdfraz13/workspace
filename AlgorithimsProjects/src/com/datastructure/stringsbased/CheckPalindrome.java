package com.datastructure.stringsbased;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome {

	public static void main(String[] args) {
		String                 input1 = "madam";
		if(isPalindromeUsingArray(input1)){
			System.out.println("Yes .. I am palindrome ");
		}else{
			System.out.println("No .. Not palindrome ");
		}
	}
	
	private static boolean isPalindromeUsingArray(String a) {
		int leftIndex = 0;
		int rightIndex = a.length()-1;
		char[] charArray = a.toCharArray();
		boolean isPalindrome = false;
		while(leftIndex < rightIndex){
			if(charArray[leftIndex] == charArray[rightIndex]){
				isPalindrome = true;
			}else{
				break;
			}
			leftIndex++;
			rightIndex--;
		}

		return isPalindrome;
	}
	
	private static boolean isPalindrome(String a) {
		Map<Character,Integer> map = new HashMap<>();
		a.codePoints().forEach(System.out::println);
		return false;
	}

}
