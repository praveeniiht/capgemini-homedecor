package com.homedecore.online.model;

import java.io.Serializable;

public class Customer implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersiognUID =1L;

	/** The id of user also customer id   */
    private Long userId;
    
    /** The name of  customer    */
    private String customerName;
    
    /** The home address like street name of customer   */
    private String address;
    
    /** The city  of customer   */
    private String city;
    
    /** The state  of customer   */
    private String state;
    
    /** The mail id of customer   */
    private String mail;
    
    /** The contact number of customer   */
    private Long contactNumber;

    /**
     * Gets the customer Id.
     */
	public Long getUserId() {
		return userId;
	}

	 /**
     * Sets the customer Id.
     */
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
     * Gets the customer name.
     */
	
	public String getCustomerName() {
		return customerName;
	}

	/**
     * Sets the customer name.
     */
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
     * Gets the customer street address.
     */
	
	public String getAddress() {
		return address;
	}

	/**
     * Sets the customer street address.
     */
	
	public void setAddress(String address) {
		this.address = address;
	}

	/**
     * Gets the customer city name.
     */
	
	public String getCity() {
		return city;
	}

	/**
     * Sets the customer city name.
     */
	
	public void setCity(String city) {
		this.city = city;
	}

	/**
     * Gets the customer state name.
     */
	
	public String getState() {
		return state;
	}

	/**
     * Sets the customer state name.
     */
	
	public void setState(String state) {
		this.state = state;
	}

	/**
     * Gets the customer email id.
     */
	
	public String getMail() {
		return mail;
	}

	/**
     * Sets the customer email id.
     */
	
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
     * Gets the customer contact number.
     */
	
	public Long getContactNumber() {
		return contactNumber;
	}

	/**
     * Sets the customer contact number.
     */
	
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
    
 }
