package com.springcorepro.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coll_main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionsconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProp());
	}
}
