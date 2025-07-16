package com.springcorepro.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CI_main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
		Person person1 = (Person) context.getBean("person1");
//		System.out.println(person1);
		Addition add = (Addition) context.getBean("addition");
		int sum = add.sum();
		Addition add2 = (Addition) context.getBean("add");
		int sum2 = add2.sum();
		System.out.println("sum = " + sum + "sum2 = " + sum2);
	}
}