package com.intigral.programs.basics;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {

	public static void main(String[] args) {
		String[] array = {"eat", "tea", "tan", "ate", "nat", "bat", "add","bcd"};

		System.out.println(Solution2(array));

	}

	private static void solution(String[] array){
		long codePoint; // we can also use BigInteger to prevent overflow.
		// why this prime numbers ? On what basis selection of prime numbe ?
		int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103 };

		// Why Linked HashMap
		Map<Long, List<String>> anagramGroup = new LinkedHashMap<>();
		for(String s:array){
			codePoint = 1;
			for (int i = 0; i < s.length(); i++) {
				codePoint *= prime[s.charAt(i) - 'a'];
			}
			if(!anagramGroup.containsKey(codePoint)){
				// Why linked list ?
				List<String> anagrams = new LinkedList<>();
				anagrams.add(s);
				anagramGroup.put(codePoint, anagrams);
			} else {
				anagramGroup.get(codePoint).add(s);
			}
		}
		System.out.println(anagramGroup.values());
	}

	private static Collection<List<String>> Solution2(final String[] strings) {
		final Map<Integer, List<String>> anagrams = new HashMap<>();
		for (final String str : strings) {
			int hash = 0;
			for (final char c : str.toCharArray()) {
				hash += (int) Character.toLowerCase(c);
			}
			if (anagrams.containsKey(hash)) {
				anagrams.get(hash).add(str);
			} else {
				anagrams.put(hash, new LinkedList<String>() {{
					add(str);
				}});
			}
		}
		return anagrams.values();
	}
}
