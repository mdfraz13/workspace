package com.designpatterns.creational.builders;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee.EmployeeBuilder("121", "Mohammad Fraz").Id("123").designation("System Engg").build();
		System.out.println(emp);
	}

}
