package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentCGPAProblem {

	public static void main(String[] args) {

		List<StudentDetail> inputList = Arrays.asList(new StudentDetail("123", "Fraz", 100),
			new StudentDetail("1234", "Fraz", 90),
			new StudentDetail("4321", "Fraz1", 100),
			new StudentDetail("5321", "Fraz", 90));

		getSortedStudentDetails(inputList).stream().forEach(System.out::println);
	}

	private static List<StudentDetail> getSortedStudentDetails (List<StudentDetail> students) {

		Comparator<StudentDetail> comparatorbyCGPA = Comparator.comparing(StudentDetail::getCgpa).reversed();
		Comparator<StudentDetail> comparatorbyName = Comparator.comparing(StudentDetail::getName);
		Comparator<StudentDetail> comparatorbyId = Comparator.comparing(StudentDetail::getId);

		Comparator<StudentDetail> finalComparator = comparatorbyCGPA.thenComparing(comparatorbyName).thenComparing(comparatorbyId);


		List<StudentDetail> resultList = students.stream().sorted(finalComparator).collect(Collectors.toList());

		return resultList;
	}
}
class StudentDetail {
	String id;
	String name;
	Integer cgpa;

	public StudentDetail(String id, String name, Integer cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
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

	public Integer getCgpa() {
		return cgpa;
	}

	public void setCgpa(Integer cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "StudentDetail{" +
			   "id='" + id + '\'' +
			   ", name='" + name + '\'' +
			   ", cgpa=" + cgpa +
			   '}';
	}
}