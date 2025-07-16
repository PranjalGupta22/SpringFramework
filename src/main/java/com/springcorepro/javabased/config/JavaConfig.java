package com.springcorepro.javabased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springcorepro.javabased.config")
public class JavaConfig {
	
	@Bean
	public Address address() {
		return new Address();
	}

	@Bean(name = {"temp", "st1","student"})//bean id
	public Student s1() {
		return new Student(address());
	}
}
