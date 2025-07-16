package com.springcorepro.javabased.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JBC_main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("st1",Student.class);
		System.out.println(student.getName());
		student.run();
	
		Address address = context.getBean("address",Address.class);
		System.out.println(address.getCity());
		System.out.println(address.getStreet());
		address.display();
	}
}
