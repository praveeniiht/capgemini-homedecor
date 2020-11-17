package com.homedecore.online.repository;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.Customer;

public interface ICustomerRepository {
	/*
	 * * add  new Customer
	 */
	public boolean addCustomer(Customer customer) throws DatabaseOperationException;
	
	/*
	 * * display all customers
	 */
	public List<Customer> findAllCustomers() throws DatabaseOperationException;
	
	
	/*
	 * * find customer by id
	 */
	public Customer findCustomerById(long id) throws DatabaseOperationException;
	


}
