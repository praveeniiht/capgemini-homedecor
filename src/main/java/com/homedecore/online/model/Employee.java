package com.homedecore.online.model;

import java.io.Serializable;

public class Employee implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersiognUID =1L;

	/** The id of user also employee id   */
    private Long userId;
    
    /** The name of  employee    */
    private String employeeName;
    
    /** The home address like street name of employee   */
    private String address;
    
    /** The city  of employee   */
    private String city;
    
    /** The state  of employee   */
    private String state;
    
    /** The mail id of employee   */
    private String mail;
    
    /** The contact number of employee   */
    private Long contactNumber;
    
    /** The department id of employee   */
    private Integer departmentId;
    
    /** The designation of employee like Admin,Ordinary  */
    private String designation;
    
    

    /**
     * Gets the employee Id.
     */
	public Long getUserId() {
		return userId;
	}

	 /**
     * Sets the employee Id.
     */
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
     * Gets the employee name.
     */
	
	public String getEmployeeName() {
		return employeeName;
	}

	/**
     * Sets the employee name.
     */
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
     * Gets the employee street address.
     */
	
	public String getAddress() {
		return address;
	}

	/**
     * Sets the employee street address.
     */
	
	public void setAddress(String address) {
		this.address = address;
	}

	/**
     * Gets the employee city name.
     */
	
	public String getCity() {
		return city;
	}

	/**
     * Sets the employee city name.
     */
	
	public void setCity(String city) {
		this.city = city;
	}

	/**
     * Gets the employee state name.
     */
	
	public String getState() {
		return state;
	}

	/**
     * Sets the employee state name.
     */
	
	public void setState(String state) {
		this.state = state;
	}

	/**
     * Gets the employee email id.
     */
	
	public String getMail() {
		return mail;
	}

	/**
     * Sets the employee email id.
     */
	
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
     * Gets the employee contact number.
     */
	
	public Long getContactNumber() {
		return contactNumber;
	}

	/**
     * Sets the employee contact number.
     */
	
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
     * Gets the employee department number.
     */
	
	public Integer getDepartmentId() {
		return departmentId;
	}

	/**
     * Sets the employee department number.
     */
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
     * Gets the employee designation like Admin,Ordinary.
     */
	
	public String getDesignation() {
		return designation;
	}

	/**
     * Sets the employee designation like Admin,Ordinary.
     */
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
    	
}
