package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListLamda2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Core Java","Spring","Spring JPA","Java Collection");

		Stream<String> st = Stream.of("Core Java","Spring","Spring JPA","Java Collection");
		st.forEach(System.out :: println);

		//list.stream().flatMap(s -> {s.});
		Stream<String> stream = list.stream().flatMap(s -> {
									String[] str = s.split(" "); 
									return Arrays.stream(str).distinct(); 
									});
					//.distinct();
					//.forEach(System.out::println);
		
		
		List<Employee> lst =  Arrays.asList(new Employee(1, "Sabiha"),new Employee(2, "Fraz"));
		
		
		// First convert list to map
		Map<String,Integer> map = new HashMap<>();
		//Map<String,Integer> map2 = stream.collect(Collectors.toMap((String s) -> s,(String s) -> map.compute(s, ((k,v) -> v!=null ? v+1:1))));
		Map<String,Integer> map2 = stream
					.collect(Collectors.toMap((String s) -> s,
										      (String s) -> map.compute(s, ((k,v) -> v!=null ? v+1:1)),
											  (v, newValue) -> v));
		System.out.println(map2);
	}

}
