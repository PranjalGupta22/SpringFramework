package com.springcorepro.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{2*4}")
	private int x;
	
	@Value("#{5*6}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(225)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
//	@Value("#{new String('Pranjal')}")//BOTH ARE SAME WILL WORK SAME
	@Value("#{new java.lang.String('Pranjal')}")
	private String name;

	@Value("#{8*6>5*3}")
	private boolean isActive;

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	//AS WE'RE JUST PRINTING VALUES HENCE WE DON'T NEED GETTER OR SETTER METHODS
//	public int getX() {
//		return x;
//	}
//	public void setX(int x) {
//		this.x = x;
//	}
//	public int getY() {
//		return y;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
	
	
	
	
	
	
	
}
