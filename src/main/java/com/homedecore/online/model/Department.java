package com.homedecore.online.model;

import java.io.Serializable;

public class Department implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID =1L;
	
	/** The Department number  */
	private Integer departmentId;
	
	/** The Department name  */
	private String departmentName;
	
	/**
     * Gets the department id.
     *
     * @return the department id
     */

	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * Sets the department id.
	 *
	 * @param department name the new department id
	 */

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
     * Gets the department name.
     *
     * @return the department name
     */
	
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * Sets the department name.
	 *
	 * @param department name the new department name
	 */

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
