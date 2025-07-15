package com.springcorepro.autowire_annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

public class Employee {
	private String name;
	

//	@Autowired
//	@Qualifier("address")
	private Address address;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
//	@Autowired
//	
//	public Employee(String name, Address address) {
//		super();
//		this.name = name;
//		
//		this.address = address;
//		System.out.println("hiiii ");
//	}
	
	@Autowired
	public Employee(@Value("Pranjal") String name, @Qualifier("address2") Address address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("hiiii ");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
