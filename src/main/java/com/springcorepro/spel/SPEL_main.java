package com.springcorepro.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class SPEL_main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SPELconfig.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		System.out.println(d1);
		//another method for SpEL
//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression ex =  temp.parseExpression("10*3");
//		System.out.println(ex.getValue());
	}
}
