package com.springcorepro.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ci {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
		
	}
}
