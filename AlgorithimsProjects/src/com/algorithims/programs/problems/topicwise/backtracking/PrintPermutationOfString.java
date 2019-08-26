package com.algorithims.programs.problems.topicwise.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutationOfString {

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		permute(str, 0, len-1);
	}

	public static void permute(String str,int i,int k) {
		if(i == k) {
			System.out.println(" "+str);
		}else {
			for(int x=i;x<=k;x++) {
				str = swap(str, i, x);
				permute(str,i+1, k);
				str = swap(str, i, x);
			}
		}
		
	}
	
	public static String swap(String str,int i,int k) {
		char[] chararray = str.toCharArray();
		char c = chararray[k];
		chararray[k] = chararray[i];
		chararray[i] = c;
		return new String(chararray);
	}
	
}
