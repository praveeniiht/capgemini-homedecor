package com.homedecore.online.repository;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.Department;

public interface IDepartmentRepository {
	/*
	 * * add a new department
	 */
	public boolean addDepartment(Department department) throws DatabaseOperationException;
	
	/*
	 * * display all department details
	 */
	public List<Department> displayAllDepartments() throws DatabaseOperationException;
	
	/*
	 * * display all city names witin a state
	 */
	public Department findDepartmentById(Integer id) throws DatabaseOperationException;
	
}
