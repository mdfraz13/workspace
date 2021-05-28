package com.datastructure.stringsbased;

public class ImplementSubStringStr {

	public static void main(String[] args) {
		final var haystack = "";
		final var needle = "";

		//System.out.println(isMatched(haystack, needle));
		System.out.println(indexOfStrStr(haystack, needle));

	}

	public static boolean isMatchedUsingString(String haystack, String needle) {
		boolean result = false;
		for (int i = 0; i < needle.length();) {
			for (int j = 0; j < haystack.length(); j++) {
				if (needle.length() > i && haystack.charAt(j) == needle.charAt(i)) {
					System.out.println("matches .. " + haystack.charAt(j) + " with " + needle.charAt(i));
					i++;
					result = true;
				} else {
					System.out.println(" ----- ");
				}
			}
		}

		System.out.println(" ---- " + result);
		return result;
	}

	public static boolean isMatched(String haystack, String needle) {
		char[] hay = haystack.toCharArray();
		char[] needleArr = needle.toCharArray();

		int i = 0;
		int x = 0;
		boolean[] needleBoo = new boolean[needleArr.length];
		while (i < hay.length && x < needleArr.length) {
			
			if (hay[i] == needleArr[x]) {
				needleBoo[x] = true;
				x = x + 1;
			}
			else
			{
				x = 0;
			}
			
			i++;
		}
		
		for (boolean f : needleBoo) {
			if (!f) {
				return false;
			}
		}

		return true;
	}
	
	public static int indexOfStrStr(String haystack, String needle) {
		char[] hay = haystack.toCharArray();
		char[] needleArr = needle.toCharArray();

		int i = 0;
		int x = 0;
		while (i < hay.length && x < needleArr.length) 
		{
			if (hay[i] == needleArr[x]) {
				x = x + 1;
				if (x == needleArr.length-1) {
					return i - x + 1;
				}
			}
			else
			{
				x = 0;
			}
			i++;
		}

		return -1;
	}

}
