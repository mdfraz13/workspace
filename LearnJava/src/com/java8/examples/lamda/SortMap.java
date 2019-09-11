package com.java8.examples.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        unsortMap.put("f", 45);
        
        ArrayList<String> sortedList = new ArrayList<>(unsortMap.keySet());
        Collections.sort(sortedList, (String a,String b) -> a.compareTo(b));
        for(String k : sortedList) {
        	System.out.println(k+"="+unsortMap.get(k));
        }
        
        System.out.println("===========================================");
        Map<String,Integer> sortedMap = new TreeMap<>(unsortMap);
        for(Map.Entry<String, Integer> k : sortedMap.entrySet()) {
        	System.out.println(k.getKey()+"="+k.getValue());
        }
        System.out.println("===========================================");
      
        // JAVA - 8
        // SORTING on Keys
        unsortMap.keySet().stream()
        					.sorted((String a,String b) -> a.compareTo(b))
        					.forEach(System.out::print);
        					//.collect(Collectors.toMap(keyMapper, valueMapper), valueMapper))
        
        // Sort by Values
        unsortMap.entrySet()
		        .stream()
				.sorted((Map.Entry<String,Integer> a,Map.Entry<String,Integer> b) -> a.getValue().compareTo(b.getValue()))
				.forEach(System.out::print);
        
     // Sort by Values
        unsortMap.entrySet()
		        .stream()
				.sorted((Map.Entry<String,Integer> a,Map.Entry<String,Integer> b) -> a.getValue().compareTo(b.getValue()));
				//.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,LinkedHashMap::new));
        
        // Java 8 Map to List
        
        unsortMap.keySet().stream().collect(Collectors.toList()).forEach(s -> System.out.print(s+"->>"));
        System.out.println("------------------------------------------------");
        unsortMap.values().stream().collect(Collectors.toList()).forEach(s -> System.out.print(s+"->>"));
        
        unsortMap.entrySet().stream().forEach(s -> System.out.print(s+"->>"));
        
        
	}

}
