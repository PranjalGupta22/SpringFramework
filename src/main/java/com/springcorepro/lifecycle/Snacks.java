package com.springcorepro.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//COMMENT -- IMPLEMENTING LIFECYCLE BY ANNOTAION
public class Snacks {
	private String name;

	public String getName() {  
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Snacks() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Snacks [name=" + name + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("calling init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("calling destroy");
	}
	
}
