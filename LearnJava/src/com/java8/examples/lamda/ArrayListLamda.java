package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListLamda {

	public static void main(String[] args) {
		List<Employee> lst =  Arrays.asList(new Employee(1, "Sabiha"),new Employee(2, "Fraz"));
		
		List<String> list1 =lst.stream()
						   .map(e -> e.getName().toUpperCase())
						   .collect(Collectors.toList());
		
		
		List<Employee> list2 =lst.stream()
				   .map( (Employee e) -> {int id = e.getId();
							   			  String name = e.getName();
							   			  return new Employee(id, name);
				   						})
				   .collect(Collectors.toList());
		
		Map<Integer,String> map = lst.stream().collect(Collectors.toMap( Employee::getId, Employee::getName));
		map.entrySet().stream().forEach(System.out::println);
		
	}

}
class Employee{
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}