package com.algorithims.programs.problems.hackerRank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigSorting {

	public static void main(String[] args) {
		String[] arr = {"31415926535897932384626433832795","1","3","5"};
		/*BigInteger[] bigN = new BigInteger[arr.length];
		int count = 0;
		for(String val : arr) {
			BigInteger num = new BigInteger(val);
			bigN[count] = num;
			count++;
		}
		Arrays.sort(bigN);
		System.out.println(Arrays.toString(bigN));
		// Solution giving Timeout..
		*/
		Arrays.sort(arr,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() != o2.length()) {
					return (o1.length() - o2.length());
				}else {
					return new BigInteger(o1).compareTo(new BigInteger(o2));
				}
			}
		});
		
		System.out.println(Arrays.asList(arr));
	}

}
