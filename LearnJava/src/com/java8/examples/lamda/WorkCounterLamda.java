package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WorkCounterLamda {

	public static void main(String[] args) {
		List<String> lines =  Arrays.asList(new String[] {"Java String","Stg Mail","St1g","String Java","String Object","String String","Python String"});
		/*
		 * lines.stream().flatMap(s -> { String[] l = s.split(" "); return
		 * Arrays.asList(l).stream(); })
		 * .collect(Collectors.toList()).forEach(System.out::println);
		 */
		
		
		HashMap<String,Integer> mapper = new HashMap<>();
		lines.stream().flatMap(s -> {
			String[] l = s.split(" ");
			return Arrays.asList(l).stream();
		}).forEach(s -> System.out.println(s));
		//forEach(s -> mapper.compute(s,(k,v) -> v!=null ? v +1:1));
		
		//.forEach((k1,v1) -> System.out.prinln(k1+"="+v1));
		
		//mapper.keySet().stream().map(k -> mapper.get(k)).forEach((k1,v1) -> System.out.prinln(k1+"="+v1));
		System.out.println("===================================================");
		List<String> wordsCount =  Arrays.asList(new String[] {"Java","Java","Java","String","String","String String","String"});
		Map<String,Integer> map = new HashMap<>();
		wordsCount.stream()
				 //.collect(Collectors.toMap(k,map))
				.forEach(k -> map.compute(k, (key,v) -> v !=null ? v+1 :1));
		map.entrySet().stream().forEach(System.out::println);
		
	}

}
