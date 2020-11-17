package com.homedecore.online.service;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.Employee;

public interface IEmployeeService {
	/*
	 * * add  new Employee
	 */
	public boolean addEmployee(Employee employee) throws DatabaseOperationException;
	
	/*
	 * * display all employees
	 */
	public List<Employee> findAllEmployees() throws DatabaseOperationException;
	
	
	/*
	 * * find employee by id
	 */
	public Employee  findEmployeeById(long id) throws DatabaseOperationException;
	
	/*
	 * * remove employee by id
	 */
	public void removeEmployee(long id) throws DatabaseOperationException;
	
	/*
	 * * check employee is admin by id
	 */
	public Boolean isAdmin(long employeeId) throws DatabaseOperationException;
	
}
