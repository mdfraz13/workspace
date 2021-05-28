package com.datastructure.stringsbased;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		final String[] strs = {"flower", "flow", "flight"}; //--- fl
		//final String[] strs = {"dog", "racecar", "car"}; // ""
		//final String[] strs = {"car", "cir"}; 
		
		//LongestCommonPrefixSelf(strs);
		String s = longestCommonPrefix(strs);
		System.out.println(s);
	}

	private static void LongestCommonPrefixSelf(final String[] strs) {
		int minLengthOfResult = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			minLengthOfResult = Math.min(minLengthOfResult, strs[i].length());
		}

		String c = "";
		boolean stop = false;
		for (int i=0; i < minLengthOfResult && !stop; i++) {
			boolean isPresent = false;
			String firstStr = strs[0];
			for (int x = 0; x < strs.length && !stop; x++) {
				if (strs[x].charAt(i) == firstStr.charAt(i)) {
					isPresent = true;
				}
				else {
					isPresent = false;
					stop = true;
				}
			}
			if (isPresent) {
				c += firstStr.charAt(i);
			}
		}
		
		System.out.println(c);
	}
	
	 public static String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    return prefix;
		}

}
