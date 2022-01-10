package com.myform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	
	@RequestMapping("/processFormVersionOne")
	public String processFormVersionOne(
			@RequestParam("customerName") String theName,
			Model theModel) {
		
		String result = "Hello " + theName + "! welcome your page";
		
		theModel.addAttribute("result", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/jstlTag")
	public String jstlPrac() {
		return "jstl";
	}
	
	@RequestMapping("/testJquery")
	public String jQuery() {
		
		return "test-jquery";
	}
	
	
	
	
	
}








