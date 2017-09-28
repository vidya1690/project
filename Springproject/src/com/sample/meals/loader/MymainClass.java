package com.sample.meals.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.meal.service.Meals;

public class MymainClass {

	
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext appcontx =new ClassPathXmlApplicationContext("ApplicationContext.xml");
         Meals ml=	(Meals) appcontx.getBean("meals");
         ml.giveDescription();
        

	}

}
