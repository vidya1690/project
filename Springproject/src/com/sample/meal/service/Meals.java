package com.sample.meal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class Meals {
	@Autowired
	private Fruits fruit;
	@Autowired
	private Cereals cereals;
	@Autowired
	@Qualifier (value="pastry")
	private SweetsInterface pastriesChild;
	
		@Autowired
	@Qualifier(value="vegetables")
	//@Value("#{vegetables.carrot}")
	private Vegetables veg;
	@Autowired
	@Qualifier(value="vegetables")
	//@Value("setNamebeetroot")
	private Vegetables veg2;
	@Autowired
	@Qualifier(value="choco")
	private SweetsInterface ChocolatesChild;
	/*@Autowired
	private SweetsInterface sweets;*/

   private String name;



	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


	public void giveDescription()
	{
	
		StringBuilder sb=new StringBuilder();
		 sb.append("The content of meals are");
		if(fruit!=null)
		{ 
			
			sb.append("    ");
			sb.append("fruit");
			sb.append(fruit.description());
		}
		if(veg!=null)
		{
			sb.append("    ");
			sb.append("veg");
			sb.append(veg.description());
		}
		if(veg2!=null)
		{
			sb.append("    ");
			sb.append("veg2");
			sb.append(veg2.description());
		}
		if(cereals!=null)
		{
			sb.append("    ");
			sb.append("cereals");
			sb.append(cereals.description());
		}
		if(ChocolatesChild!=null)
		{
			sb.append("    ");
			sb.append("ChocolatesChild");
			sb.append(ChocolatesChild.description());
		}
		if(pastriesChild!=null)
		{
			sb.append("    ");
			sb.append("pastriesChild");
			sb.append(pastriesChild.description());
		}
		System.out.println(sb.toString());
		}


	public SweetsInterface getPastriesChild() {
		return pastriesChild;
	}


	public void setPastriesChild(SweetsInterface pastriesChild) {
		this.pastriesChild = pastriesChild;
	}


	public SweetsInterface getChocolatesChild() {
		return ChocolatesChild;
	}


	public void setChocolatesChild( SweetsInterface chocolatesChild) {
		ChocolatesChild = chocolatesChild;
	}
	


	



}
