package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(2,4,5,2,5,5,9);
		Map<Integer,Integer> map = new HashMap<>();
//		for(Integer i : lst) {
//			map.compute(i, (e,v) -> v !=null ? v+1 : 1);
//		}
//		map.entrySet().forEach(System.out::println);
		
		Map<Integer,Integer> newmap = lst.stream().distinct()
		   .collect(Collectors.toMap((Integer e) -> e ,(Integer e) -> map.compute(e, (k,v) -> v !=null ? v+1 : 1)));
		
		newmap.entrySet().forEach(System.out::println);
//		sys
//		
//		lst.stream()
//			.map(k -> map.compute(k, (e,v) -> v !=null ? v+1 : 1))
//			.forEach(System.out::println);
	}

}
