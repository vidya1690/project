package com.sample.meal.loader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sample.meal.service.Meals;
import com.sample.meal.service.Pastries;
import com.sample.meal.service.Chocolates;
import com.sample.meal.service.Fruits;
import com.sample.meal.service.Vegetables;
@Configuration
@ComponentScan("com.sample.meal")
public class javaConfigForAnnotation {
	

	@Bean
	@Scope("prototype")
	public Meals meals()
	{
		return new Meals();
	}
	@Bean
	public Chocolates chocolates() {
		return new Chocolates();
	}
	@Bean
	public Fruits fruits() {
		return new Fruits();
     }
	@Bean
	public Pastries pastries() {
		return new Pastries();
	}
	
	@Bean
	public Vegetables vegetables() {
		return new Vegetables();
	}
	
	
	}


