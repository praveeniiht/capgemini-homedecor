package com.homedecore.online.repository;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.Salary;

public interface ISalaryRepository {
	
	/*
	 * * add  new salary slip for an Employee
	 */
	public boolean addSalarySlip(Salary salary) throws DatabaseOperationException;
	
	/*
	 * * display all salary slips
	 */
	public List<Salary> findAllSalarySlips() throws DatabaseOperationException;
	
	
	/*
	 * * find salary slip by Salary slip id
	 */
	public  Salary findSalarySlipById(long id) throws DatabaseOperationException;
	
	/*
	 * * display all salary slips of an employee
	 */
	public List<Salary> findAllSalarySlipsByEmployeeId(long userId) throws DatabaseOperationException;
	

}
