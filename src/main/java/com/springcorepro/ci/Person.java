package com.springcorepro.ci;

public class Person {
	private int id;
	private String name;
	
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return this.name + " : " + this.id;
	}
}
