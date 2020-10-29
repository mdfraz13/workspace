package com.java8.examples.lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {

		// Convert Map to LinkedHashMap
		// Sort Employee by Name....
		Map<String, Employee> empolyeeIdMap = new HashMap<>();
		empolyeeIdMap.put("100000", new Employee(100000, 2,"AKRAM"));
		empolyeeIdMap.put("200000", new Employee(200000, 3,"ASIF"));
		empolyeeIdMap.put("300000", new Employee(300000, 4,"SAIF"));
		empolyeeIdMap.put("500000", new Employee(500000, 2,"FRAZ"));
		empolyeeIdMap.put("400000", new Employee(400000, 3,"FAIS"));

		Map<Integer, String> result = empolyeeIdMap.entrySet().stream()
					 .filter(e -> e.getValue()!=null && !e.getValue().getName().equalsIgnoreCase("SAIF"))
					 .sorted((e1, e2) -> {
					 	return e1.getValue().getName().compareTo(e2.getValue().getName());
					 }).collect(Collectors.toMap(e -> e.getValue().getId(), e -> e.getValue().getName()));

		System.out.println(result.toString());


		// Group by department
		Map<Integer, List<Employee>> employeeTempMap = new HashMap<>();
		empolyeeIdMap.entrySet().stream()
			.map(e -> employeeTempMap.compute(e.getValue().getId(), (k , v) -> {
				v.add(e.getValue());
				return v;
			})).sorted();


		System.out.println(result.toString());


	}
}
