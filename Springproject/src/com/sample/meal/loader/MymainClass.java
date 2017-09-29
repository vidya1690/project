package com.sample.meal.loader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sample.meal.service.Meals;

public class MymainClass {

	
	
	
	public static void main(String[] args) {
		
		
		//ApplicationContext appcontext =new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		ApplicationContext appcontext=new AnnotationConfigApplicationContext(javaConfigForAnnotation.class);
	//	appcontext.
         Meals m1=	(Meals) appcontext.getBean("meals");
         Meals m2=	(Meals) appcontext.getBean("meals");
         m1.setName("vidya");
         m2.setName("Vijayan");
         
       if(m1.getName().equals(m2.getName()))
       {
    	   System.out.println("we are singleton");
       }
       
       else
       {
    	   System.out.println("not singleton");
       }
         m1.giveDescription();
        

	}

}
