package com.java8.examples.optional;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalExamples {

	public static void main(String[] args) {
		Integer a = null;
		Optional<Integer> i = Optional.ofNullable(a);
		//Optional<Integer> i = Optional.of(a);
		
		System.out.println(i.isPresent());
		System.out.println(i.toString());
		System.out.println(i.orElse(0));
		
		Integer b = 100;
		//Optional<Integer> i1 = Optional.ofNullable(b);
		Optional<Integer> i1 = Optional.of(b);
		System.out.println(i1.isPresent());
		System.out.println(i1.toString());
		
		User user = new User();
		user.setId("10");
		user.setAddress("Address");
		String str = user.getAddress().map(s -> s.toUpperCase()).get();
		
		System.out.println(user);
		System.out.println(str);

		Stream<Employee> x = Stream.of(new Employee("10", "20"));
		Optional<Employee> eee = x.filter(e -> e.getId().equals("21")).findAny();
		System.out.println(eee.isPresent());

		String va = eee.isPresent() ? eee.get().getId() : "0";
		System.out.println(va);
	}

}
class User{
	
	private String id;
	private String address;


	
	public Optional<String> getId() {
		return Optional.of(id);
	}
	public void setId(String id) {
		this.id = id;
	}
	public Optional<String> getAddress() {
		return Optional.of(address);
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", address=" + address + "]";
	}

}

class Employee{

	private String id;
	private String name;

	public Employee(String id, String name) {
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
}