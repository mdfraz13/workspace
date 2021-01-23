package com.datastructure.stringsbased;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsFromString {

	public static void main(String[] args) {
		String s = "AAANDSSSSSB";
		Map<Character,Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
			map.compute(x, (k,oldvalue) -> oldvalue!=null ? oldvalue+1:1 );
		}
		map.entrySet().stream().filter(kv -> kv.getValue() > 1).forEach(System.out::println);
	}
	
}
