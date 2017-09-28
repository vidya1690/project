package com.sample.meal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Meals {
	@Autowired
	private Fruits fruit;
	@Autowired
	private Cereals cereals;
	/*@Autowired
	@Qualifier (value="pastry")*/
	private SweetsInterface pastriesChild;
	@Autowired
	private Vegetables veg;
	/*@Autowired
	@Qualifier(value="choco")*/
	private SweetsInterface ChocolatesChild;
	/*@Autowired
	private SweetsInterface sweets;*/
	
	
	public void giveDescription()
	{
	
		StringBuilder sb=new StringBuilder();
		 sb.append("The content of meals are");
		if(fruit!=null)
		{
			sb.append("fruit");
			sb.append(fruit.description());
		}
		if(veg!=null)
		{
			sb.append("veg");
			sb.append(veg.description());
		}
		if(cereals!=null)
		{
			sb.append("cereals");
			sb.append(cereals.description());
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


	public void setChocolatesChild(SweetsInterface chocolatesChild) {
		ChocolatesChild = chocolatesChild;
	}

}
