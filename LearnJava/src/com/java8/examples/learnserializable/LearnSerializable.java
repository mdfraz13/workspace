package com.java8.examples.learnserializable;

import java.io.Serializable;


public class LearnSerializable extends NonSerializable implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String id;
	
	public LearnSerializable(String id) {
		super();
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/*
	 * public NonSerializable getNonserialized() { return nonserialized; } public
	 * void setNonserialized(NonSerializable nonserialized) { this.nonserialized =
	 * nonserialized; }
	 */
	
}
class NonSerializable{
	
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}