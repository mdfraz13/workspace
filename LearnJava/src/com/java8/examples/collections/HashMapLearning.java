package com.java8.examples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;

public class HashMapLearning {

	public static void main(String[] args) {
		Map<Product, String> productStringMap = new HashMap<>();
		productStringMap.put(new Product("10", "P1"), "Product 1");
		productStringMap.put(new Product("10", "P2"), "Product 2");
		productStringMap.put(new Product("11", "P1"), "Product 3");

		final var p = new Product("10", "P1");
		System.out.println(productStringMap.get(p));

		final var p2 = new Product("10", "P2");
		System.out.println(productStringMap.get(p2));

		productStringMap.compute(p, (k, v) -> v !=null ? v.concat("12212") : "");
		System.out.println(productStringMap.get(p));

		final var p3 = new Product("12", "P2");
		//final var function = k ->
		productStringMap.computeIfAbsent(p3, k -> k.getName().concat("modified.."));
		System.out.println(productStringMap.get(p3));
	}
}
class Product {

	private String id;
	private String name;

	public Product(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (!(o instanceof Product)) { return false; }
		Product product = (Product) o;
		return Objects.equals(id, product.id) &&
			   Objects.equals(name, product.name);
	}

	@Override
	public int hashCode() {
		return Integer.valueOf(id);
	}

	@Override
	public String toString() {
		return "Product{" +
			   "id='" + id + '\'' +
			   ", name='" + name + '\'' +
			   '}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}