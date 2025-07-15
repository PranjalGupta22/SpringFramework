package com.springcorepro.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List friends;
	private Map<String, Integer> feeStructure;
	private Properties dbProperties;
	
	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public List getFriends() {
		return friends;
	}

	public void setFriends(List friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", dbProperties=" + dbProperties + "]";
	}

	

	
	
	
}
