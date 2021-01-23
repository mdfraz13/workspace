package com.algorithims.programs.problems.topicwise.Stringbased;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "ABC";
		//char[] input = word.toCharArray();
		permute(word, 0, word.length()-1);
	}
	
	private static void permute(String str,int i ,int n) {
		if(i == n) {
			System.out.println(""+str);
		}else {
			for(int j=i;j<=n;j++) {
				str = swap(str,i,j);
				permute(str, i+1, n);
				str = swap(str, i, j);
			}
		}
		
		//return result;
	}
	
	private static String swap(String a,int i,int j) {
		char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
	}

}
