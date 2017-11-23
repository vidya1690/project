package com.fitness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitness.model.Exercise;

@Controller
public class addMinutes {
	
	
    @RequestMapping(value="/addMinutes")
	public String addMiuntes(@ModelAttribute ("exercise") Exercise exercise)
	{
    	System.out.println("Exercise    "+exercise.getMinutes());
		return "addMinutes";
	}
  /*  @RequestMapping(value="/addMoreMinutes")
   	public String addMoreMiuntes(@ModelAttribute ("exercise") Exercise exercise)
   	{
       	System.out.println("Exercising  more    "+exercise.getMinutes());
   		return "addMinutes";
   	}
*/
}
