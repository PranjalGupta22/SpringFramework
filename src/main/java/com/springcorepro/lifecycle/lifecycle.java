package com.springcorepro.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifecycle {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("LCconfig.xml");
//		Items item1 = (Items)context.getBean("item1");
////		context.registerShutdownHook();
//		System.out.println(item1);
//		Drinks drink1 = (Drinks) context.getBean("drink1");
//		System.out.println(drink1);
		
		Snacks snack1 = (Snacks) context.getBean("snack1");
		System.out.println(snack1);
		context.registerShutdownHook();
	}
}
