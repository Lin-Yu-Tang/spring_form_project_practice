package com.myform.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myform.entity.Customer;
import com.myform.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	
	// need to inject our customer serivce
	@Autowired
	private CustomerService customerService;
	
	@InitBinder 
	protected void initBinder(WebDataBinder binder) { 
	    
		// remove leading and trailing whitespace (true : if an empty String is to be transformed into null)
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		// 
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
		

		
	} 
	
	@GetMapping("/registerForm")
	public String registerForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@PostMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer, 
			BindingResult theBindingResult,
			Model theModel
			) {
		
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}
		
		// ID to upper-case
		String theIdentity = theCustomer.getIdentity().toUpperCase();
		
		theModel.addAttribute("theId", theIdentity);
		
		
		
		// log the input data
		System.out.println("The Customer: " + theCustomer.getTheName());
		
		System.out.println("Gender: " + theCustomer.getGender());
		
		System.out.println("Email: " + theCustomer.getEmail());
		
		System.out.println("Identiy: " + theIdentity);
		
		System.out.println("Binding Result: " + theBindingResult);
		
		// save the customer using our service
		customerService.saveCustomer(theCustomer);
		
		return "customer-confirmation";
	}
	
	
	// save the customer's submisson to DB
	@PostMapping("/submit-success") 
	public String saveCustomer() {
		

		
		return "submit-success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

















