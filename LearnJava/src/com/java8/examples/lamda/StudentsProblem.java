package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentsProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(
	            "Jayesh",
	            21,
	            new Address("1234"),
	            Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
	 
	        Student student2 = new Student(
	            "Khyati",
	            18,
	            new Address("1235"),
	            Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
	 
	        Student student3 = new Student(
	            "Jason",
	            22,
	            new Address("1236"),
	            Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
	        
	      List<Student> lst = Arrays.asList(student1,student2,student3);
	      System.out.println("=================================================================");
	      lst.stream()
	      	 .filter(e -> e.name.equals("Jayesh"))
	      	 .forEach(System.out::println);
	      System.out.println("=================================================================");
	      lst.stream()
	      	 .filter(e -> e.address.name.equals("1235"))
	      	 .forEach(System.out::println);
	      
	      System.out.println("=================================================================");
//	      lst.stream()
//	         .flatMap(e -> e.mobileNumbers.stream())
//	      	 .filter(e -> e.number.equals("3333"))
//	      	 .forEach(System.out::println);
	      lst.stream()
	      	 .filter(e -> {
	      		 			return e.mobileNumbers.stream().anyMatch(n -> n.number.equals("3333"));
	      	 }).forEach(System.out::println);
	      System.out.println("=================================================================");
	      Collections.sort(lst);
	      lst.stream().forEach(System.out::println);
	      System.out.println("=================================================================");
	      Collections.sort(lst,(Student o1,Student o2) -> ((o1.name).compareTo(o2.name)));
	      lst.stream().forEach(System.out::println);
	}

}
class Student implements Comparable<Student>{
	public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;
	public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", mobileNumbers=" + mobileNumbers
				+ "]";
	}
	@Override
	public int compareTo(Student o) {
		return new Integer(this.age).compareTo(o.age);
	}
	
	
}
class Address {
	
	String name;

	public Address(String name) {
		super();
		this.name = name;
	}
	
}
class MobileNumber{
	
	String number;

	public MobileNumber(String number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "MobileNumber [number=" + number + "]";
	}
}