package com.fitness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FitnessHomeController {
	
	@RequestMapping(value ="/greeting")
 public String DisplaywelcomeMessage(Model model)
 {
		
		model.addAttribute("message","hello world");
	return "showMessage";
	 
 }

}
