package com.myform.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myform.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		// get the current hiberante session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
		// and sort by last name ( order by lastName )
		Query<Customer> theQuery = 
						currentSession.createQuery("from Customer order by lastName", Customer.class);
				
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
				
		// return the results
		return customers;
	}
	
	@Override
	public void saveCustomer(Customer theCustomer) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/update the customer
		currentSession.saveOrUpdate(theCustomer);
	}
	
	
}
