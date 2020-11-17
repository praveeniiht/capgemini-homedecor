package com.homedecore.online.service;

import java.util.Date;
import java.util.List;

import com.homedecore.online.exceptions.ApplicationException;
import com.homedecore.online.exceptions.BusinessException;
import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.Salary;

public interface ISalaryService {
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
	
	/*
	 * *  Tax calculation of a salary slip of an employee
	 */
	public Double taxCalculation(Salary salary) throws DatabaseOperationException,BusinessException;
	 
	/*
	 * *  Salary calculation of a salary slip of an employee for a date by accepting 
	 *    commission amount and date.
	 */
	public Salary salaryCalculation(Salary salary,double commission,Date date) throws DatabaseOperationException,BusinessException,ApplicationException;
	
}
