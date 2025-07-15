package com.springcorepro.stereoype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SA_main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SAconfig.xml");
		Student s1 = context.getBean("s1",Student.class);
		System.out.println(s1);
		//without declaring scope in bean o/p 547201549,547201549
//		after declaring scope in bean o/p547201549, 236304360
		beanScope bs1 = context.getBean("scope",beanScope.class);
		System.out.println(bs1.hashCode());
		beanScope bs2 = context.getBean("scope",beanScope.class);
		System.out.println(bs2.hashCode());
		
	}
}
