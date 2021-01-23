package com.java8.examples.features;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Employee,Employee> emp = new HashMap<>();
		//Map<String,Employee> emp = new HashMap<>();
		Employee e = new Employee("1", "2");
		emp.put(e, e);
//		Employee e1 = new Employee("1", "2");
//		emp.put(e1, e);
//		Employee e2= new Employee("1", "2");
//		emp.put(e2, e);
//		Employee e2 = new Employee("13", "2");
//		emp.put(e2, e);
//		Employee e3 = new Employee("14", "2");
//		emp.put(e3, e);
		Employee e1 = e;
		e1.id = "4";
		//e = new Employee("5", "2");
		//emp.put(e, e);
		//System.out.println(e.toString());
		//e.id = "2";
		//System.out.println(e.toString());
		System.out.println("=================================");
		System.out.println(emp.get(e));
		
		//System.out.println(emp.get("1"));
		
	}

}
class Employee{
	
	String id;
	String name;
	
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println(result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals.....");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + " ]";
	}
}