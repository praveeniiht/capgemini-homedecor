package com.homedecore.online.model;

import java.io.Serializable;

public class User implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersiognUID =1L;

	/** The id of user, it can be customer id or employee id   */
    private Long userId;
    
    /** The password for the user   */
    private String password;

    /** The type of user, it can be customer  or employee or admin   */
    private String role;

    /**
     * Gets the userId.
     *
     * @return the userId
     */

    
    public Long getUserId() {
		return userId;
	}
    
    /**
	 * Sets the userId.
	 *
	
	 */

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
     * Gets the password.
     *
     * @return the password
     */

	public String getPassword() {
		return password;
	}

	/**
	 * Sets the user password.
	 *
	
	 */
	public void setPassword(String password) {
		this.password = password;
	}
   
	/**
     * Gets the role.
     *
     * @return the role
     */

	
	public String getRole() {
		return role;
	}

	/**
	 * Sets the user role i.e user is admin or customer or ordinary employee.
	 *
	
	 */
	public void setRole(String role) {
		this.role = role;
	}
    
    

}
