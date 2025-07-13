package com.springcorepro.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ref {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
		B b = (B) context.getBean("bref");
		A a = (A) context.getBean("aref");
		System.out.println(b.getY());
		System.out.println(a.getX());
		System.out.println(a.getObj());
		System.out.println(a.getObj().getY());
	}
}
