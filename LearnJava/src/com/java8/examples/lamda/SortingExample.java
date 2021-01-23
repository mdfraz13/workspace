package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<String> lst =  Arrays.asList(new String[] {"Java","Stg","St1g","String","String","String","Python"});
		//lst.sort((s1,s2) -> {return s1.compareTo(s2);});
		//lst.stream().distinct().forEach(s -> System.out.println(s));
		
		lst.stream().sorted((s1,s2) -> {return s1.compareTo(s2);}).distinct().forEach(System.out::println);
	}

}
