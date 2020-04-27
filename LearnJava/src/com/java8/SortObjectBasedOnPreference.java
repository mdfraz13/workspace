package com.java8;

import java.util.Arrays;
import java.util.List;

public class SortObjectBasedOnPreference {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("BASE", "21"), new Employee("UDD", "21"), new Employee("UDD1", "22"));
		employees.sort((Employee e1, Employee e2) -> {
			if(e1.type.equals("UDD1")){
				return -1;
			}else{
				return 1;
			}
		});

		System.out.println(employees);
	}
}
class Employee{

	String type;
	String age;

	public Employee(String type, String age){
		this.age = age;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Employee{" +
			   "type='" + type + '\'' +
			   ", age='" + age + '\'' +
			   '}';
	}
}