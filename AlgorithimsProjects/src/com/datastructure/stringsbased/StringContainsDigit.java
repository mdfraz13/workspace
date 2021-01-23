package com.datastructure.stringsbased;

import java.util.regex.Pattern;

public class StringContainsDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		String x = "7787";
		
		System.out.println(pattern.matcher(x).matches());
	}

}
