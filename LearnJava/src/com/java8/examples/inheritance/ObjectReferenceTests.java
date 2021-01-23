package com.java8.examples.inheritance;

public class ObjectReferenceTests {

	public static void main(String[] args) {
		Employee emp = new Employee("A");
		EmployeeWrapper wrapper = new EmployeeWrapper(emp);

		emp = new Employee("B");

		System.out.println(wrapper.getEmployee().getName());
	}
}
class EmployeeWrapper{

	private Employee employee;

	public EmployeeWrapper(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}