package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkCounterLamda {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList(
			new String[]{"Java String", "Stg Mail", "St1g", "String Java", "String Object", "String String",
				"Python String"});
		/*
		 * lines.stream().flatMap(s -> { String[] l = s.split(" "); return
		 * Arrays.asList(l).stream(); })
		 * .collect(Collectors.toList()).forEach(System.out::println);
		 */

		HashMap<String, Integer> mapper = new HashMap<>();
		lines.stream().flatMap(s -> {
			String[] l = s.split(" ");
			return Arrays.asList(l).stream();
		}).forEach(s -> System.out.println(s));
		//forEach(s -> mapper.compute(s,(k,v) -> v!=null ? v +1:1));

		//.forEach((k1,v1) -> System.out.prinln(k1+"="+v1));

		//mapper.keySet().stream().map(k -> mapper.get(k)).forEach((k1,v1) -> System.out.prinln(k1+"="+v1));
		System.out.println("===================================================");
		List<String> wordsCount = Arrays.asList(
			new String[]{"Java", "Java", "Java", "String", "String", "String String", "String"});
		Map<String, Integer> map = new HashMap<>();
		wordsCount.stream()
				  //.collect(Collectors.toMap(k,map))
				  .forEach(k -> map.compute(k, (key, v) -> v != null ? v + 1 : 1));
		//map.entrySet().stream().forEach(System.out::println);

		System.out.println("===================================================");
		final var resultMap = getRankOfWords(lines);
		resultMap.entrySet().stream().forEach(System.out::println);
	}

	private static Map<String, Integer> getRankOfWords(List<String> lines) {
		Map<String, Integer> resultMap = new HashMap<>();

		lines.stream().flatMap(e -> Stream.of(e.split(" ")))
					  .forEach(e -> resultMap.compute(e, (key, val) -> val != null ? val + 1 : 0));

		System.out.println("*****************************");
		final var e = resultMap.entrySet().stream()
				 .sorted(Comparator.comparing(Entry::getValue, Comparator.reverseOrder()))
				 .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));


		e.entrySet().forEach(System.out::println);
		System.out.println("*****************************");

		Map<String, String> emailIdNameMap = new HashMap<String, String>();
		emailIdNameMap.put("emal@hmail.com", "ema");
		emailIdNameMap.put("bar@gmail.com", "bar");
		emailIdNameMap.put("foo@hmail.com", "foo");
		emailIdNameMap.put("aba@gmail.com", "aba");


		List<String> list = emailIdNameMap
			.entrySet().stream().filter(o -> o.getKey().endsWith("gmail.com"))
			.sorted(Comparator.comparing(Entry::getValue, Comparator.naturalOrder()))
			.map(o -> o.getValue())
			.collect(Collectors.toList());
			//.collect(Collectors.toList());

		list.stream().forEach(System.out::println);


		return e;
	}

}
