package com.springcorepro.ci;

import java.lang.reflect.Constructor;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Contructor : int , int");
	}
	
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor : double , double");
	}
	
	public int sum() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		return a+b;
	}
}
