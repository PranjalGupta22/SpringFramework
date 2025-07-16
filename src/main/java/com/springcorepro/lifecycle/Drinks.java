package com.springcorepro.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// COMMENT -- INPLEMENTING LIFECYCCLE BY INTERFACE
public class Drinks implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public Drinks() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Drinks [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("calling init");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("calling destroy");
		
	}
	
	
}
