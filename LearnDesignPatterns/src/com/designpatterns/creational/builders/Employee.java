package com.designpatterns.creational.builders;

public class Employee {
	
	private String id;
	private String name;
	private String designation;
	
	public Employee(EmployeeBuilder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.designation = builder.designation;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	
	public static class EmployeeBuilder{
		private String id;
		private String name;
		private String designation;
		
		public EmployeeBuilder(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public EmployeeBuilder Id(String id) {
			this.id = id;
			return this;
		}
		
		public EmployeeBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public EmployeeBuilder designation(String designation) {
			this.designation = designation;
			return this;
		}
		
		public Employee build() {
			Employee emp = new Employee(this);
			return emp;
		}
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	

}
