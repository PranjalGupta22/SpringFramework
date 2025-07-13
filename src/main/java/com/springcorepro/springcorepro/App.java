package com.springcorepro.springcorepro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Students student1 = (Students) context.getBean("student1");
    	Students student2 = (Students) context.getBean("student2");
    	Students student3 = (Students) context.getBean("student3");
    	System.out.println(student1);
    	System.out.println(student2);
    	System.out.println(student3);
    }
}