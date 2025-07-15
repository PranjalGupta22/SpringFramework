package com.springcorepro.lifecycle;

public class Items {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Items [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Calling inti()");
	}
	
	public void destroy() {
		System.out.println("Calling destroy()");
	}
}
