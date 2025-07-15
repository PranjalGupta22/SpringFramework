package com.springcorepro.autowire_annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AW_main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AW_@config.xml");
//		Employee emp1 = (Employee) context.getBean("emp1");//type casting required
		Employee emp1 = context.getBean("emp1" , Employee.class);//type casting not required
		System.out.println(emp1);
	}
}
