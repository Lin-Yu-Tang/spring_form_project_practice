package com.myform.dao;

import java.util.List;

import com.myform.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);
}
