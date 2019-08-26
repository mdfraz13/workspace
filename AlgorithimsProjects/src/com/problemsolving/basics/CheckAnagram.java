package com.problemsolving.basics;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

	public static void main(String[] args) {
		String a = "ABC";
		String  b = "CAB";
		System.out.println(isAnagramUsingArray(a,b));
		System.out.println(isAnagramUsingHashMap(a,b));
				
	}
	
	private static boolean isAnagramUsingArray(String a ,String b) {
		int[] count = new int[256]; // ASCII
		for(int i=0;i<256;i++) {
			count[i] = 0;
		}
		
		for(int i=0;i<a.length();i++) {
			count[a.charAt(i)]++;
		}
		
		for(int i=0;i<b.length();i++) {
			count[b.charAt(i)]--;
		}
		
		boolean result = true;
		for(int i=0;i<256;i++) {
			if(count[i] != 0) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	private static boolean isAnagramUsingHashMap(String a ,String b) {
		Map<Character,Integer> map = new HashMap<>();
		a.chars().forEach(x -> map.compute((char) x, (k,v) -> ((v == null)? 1 : v+1)));
		
		b.chars().forEach(x -> map.compute((char) x, (k,v) -> ((v == null)? 0 : v-1)));
		
		boolean result = map.keySet().stream().filter(x -> map.get(x) != 0).findAny().isPresent();
		return !result;
		//return false;
	}

}
