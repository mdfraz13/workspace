package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> lst =  Arrays.asList(new Person(1, "Sabiha"),new Person(2, "Fraz"),new Person(3,"Kamran"));
		
		Map<Integer,String> map= lst.stream().collect(Collectors.toMap((Person p) -> p.getId(),(Person p) -> p.getName()));//.forEach(System.out::println);
		//lst.stream().collect(Collectors.toMap(Person::getId,Person::getName));
		map.entrySet().forEach(System.out::println);
		
		List<Profession> newlist =  Arrays.asList(new Profession("Sabiha",89),new Profession("Fraz",100),new Profession("Kamran",78));
		Map<String,Integer> newmap = newlist.stream().collect(Collectors.toMap(e ->e.getName() , e -> e.getSalary()));
		newmap.entrySet().stream().sorted((Map.Entry<String,Integer> e1,Map.Entry<String,Integer> e2) -> e1.getValue().compareTo(e2.getValue())).forEach(System.out::println);
		newmap.entrySet().stream().forEach(System.out::println);
		
		//new ConcurrentHashMap();
	}

}
class Person{
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
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
class Profession{
	
	//private Person p;
	private String name;
	private int salary;
	
	public Profession(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profession other = (Profession) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profession [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}