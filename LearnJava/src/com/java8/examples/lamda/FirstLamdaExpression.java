package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstLamdaExpression {

	public static void main(String[] args) {
		List<String> lst =  Arrays.asList(new String[] {"Java","Stg","St1g","String","String","String","Python"});
		
		Stream<String> str = lst.stream().map(s -> s.toUpperCase()).distinct().filter(s -> s.startsWith("S"));
		str.forEach(ks -> System.out.println(ks));
		
		List<String> lst2 =  Arrays.asList(new String[] {"Java String","Stg Mail","St1g","String Java","String Object","String String","Python String"});
		
		Stream<String> str2 = lst2.stream().flatMap(s -> {
														String[] split = s.split(" ");
	    												return Arrays.asList(split).stream();
	    												}).distinct();//.forEach(k -> System.out.println(k));
		
		//str2.forEach(k -> System.out.println(k));
		
		Stream<IntStream> str3 = lst2.stream()
								.flatMap(s -> Arrays.asList(s.chars()).stream())
								.distinct();//.forEach(a -> System.out.println(a.toString()));
								
		str3.forEach(a -> System.out.println(a.toString()));
		
	}

}
