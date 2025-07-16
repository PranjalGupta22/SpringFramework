package com.springcorepro.javabased.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("s1")
public class Student {
	
	private Address address;
	
	public Student(Address address) {
		super();
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Value("Pranjal")
	private String name;

	public void run() {
		System.out.println("running...");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
