package com.sample.meal.service;

import org.springframework.stereotype.Component;

@Component(value="choco")
public class Chocolates implements SweetsInterface {
public String description() {
		
		return "diary milk";
	}

}
