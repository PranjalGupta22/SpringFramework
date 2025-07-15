package com.springcorepro.stereoype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
	
	@Value("Pranjal Gupta")
	private  String name;
	@Value("Bangalore")
	private String city;
	@Value("#{phone}")//collection with value annotation
	private List<Long> phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<Integer> getPhone() {
		return phone;
	}
	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}
	
	
}
