package com.datastructure.stringsbased;

public class StringToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNumber = "00244";
		char[] c = strNumber.toCharArray();
		System.out.println(getNumber(c, 0, 0));
	}
	
	public static int getNumber(char[] c, int i, int value) {
		if (i >= c.length) {
			return value;
		}
		
		value = value * 10;
		value = value + (c[i] - '0');
		i = i + 1;
		
		return getNumber(c, i, value);
	}

}
