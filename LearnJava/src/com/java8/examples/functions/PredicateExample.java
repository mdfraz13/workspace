package com.java8.examples.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateExample {

	public Predicate<Integer> combined3 = x -> x > 10;

	public static void main(String[] args) {

		Predicate<Integer> predicate = x -> x > 10;

		System.out.println(predicate.test(10));

		System.out.println(predicate.and(predicate).test(15));

		// chaining of predicates
		System.out.println("********************* is Odd with less than 200 ********************");
		Predicate<Integer> isOdd = x -> x % 2 != 0;

		Predicate<Integer> isNumberGreaterThanRange = x -> x > 500;

		Predicate<Integer> isNumberLessThanRange = x -> x < 200;

		Predicate<Integer> isNumberDivisibleBy3 = x -> x % 3 == 0;

		Predicate<Integer> combined = isOdd
			.and(isNumberDivisibleBy3)
			.and(isNumberLessThanRange);

		Predicate<Integer> combined2 = isOdd
			.and(isNumberDivisibleBy3)
			.and(isNumberGreaterThanRange);

		IntStream.rangeClosed(150, 501).filter(e -> combined.or(combined2).test(e)).forEach(System.out::println);

		System.out.println("********************* is Prime ********************");
		// check Prime Number
		Predicate<Integer> isPrime = e -> isPrimeNumber(e);

		Predicate<Integer> combined3 = isPrime
			.and(isNumberLessThanRange);

		IntStream.rangeClosed(150, 501).filter(e -> combined3.test(e)).forEach(System.out::println);

		System.out.println("********************* is Palindrome ********************");

		Predicate<Integer> isPalindrome = e -> isPalindrome(e);
		IntStream.rangeClosed(150, 501).filter(isPalindrome::test).forEach(System.out::println);

		System.out.println(" #################### object list filter ####################");
		Predicate<Employee> employeePredicate = e -> e.getName().equalsIgnoreCase("FRAZ");
		Predicate<Employee> idPredicate = e -> e.getId().equalsIgnoreCase("10");

		Predicate<Employee> combinedEmployee = employeePredicate.or(idPredicate);
		List<Employee> employeeList = Arrays.asList(new Employee("FRaz", "20"), new Employee("Faraz", "10"), new Employee("XYX", "30"));
		System.out.println(employeeList);
		employeeList.stream().filter(combinedEmployee :: test).forEach(System.out::println);

	}

	private static boolean isPrimeNumber(int number) {
		return !IntStream.range(2, number).anyMatch(i -> number % i == 0);
	}

	private static boolean isPalindrome(int number) {

		char[] charArray = String.valueOf(number).toCharArray();
		int firstIndex = 0;
		int lastIndex = charArray.length-1;

		while (firstIndex < lastIndex) {
			if (charArray[firstIndex] == charArray[lastIndex]) {
				firstIndex++;
				lastIndex--;
			}
			else {
				return false;
			}
		}

		return true;
	}

}
class Employee {

	private String name;
	private String id;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee{" +
			   "name='" + name + '\'' +
			   ", id='" + id + '\'' +
			   '}';
	}
}

