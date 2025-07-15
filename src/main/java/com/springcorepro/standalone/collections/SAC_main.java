package com.springcorepro.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SAC_main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SACconfig.xml");
		Person p1 = context.getBean("person1",Person.class);
		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("--------------------------------------------------------------");
		System.out.println(p1.getFeeStructure());
		System.out.println(p1.getFeeStructure().getClass().getName());
		System.out.println("--------------------------------------------------------------");
		System.out.println(p1.getDbProperties());
		System.out.println(p1.getDbProperties().getClass().getName());
	}
}
