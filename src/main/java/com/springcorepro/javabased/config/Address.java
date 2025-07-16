package com.springcorepro.javabased.config;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("sarajapur")
	private String street;
	@Value("bangalore")
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void display() {
		System.out.println("displyingggg...");
	}
}
