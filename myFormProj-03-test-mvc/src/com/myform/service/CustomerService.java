package com.myform.service;

import java.util.List;

import com.myform.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
}
