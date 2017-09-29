package com.sample.meal.service;

import org.springframework.stereotype.Component;

@Component(value="pastry")
public class Pastries implements SweetsInterface{
	
	
public String description() {
		
		return "cake";
	}
}
