package com.sample.meal.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="vegetables")
public class Vegetables {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private String name;
public String description() {
			return "pea";
		
	}
}
