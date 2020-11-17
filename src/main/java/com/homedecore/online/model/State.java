package com.homedecore.online.model;

import java.io.Serializable;
import java.util.Set;

public class State implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The State name  */
	private String state;
	
	/** Cities within the state 
	 * each city name is unique
	 */
    private Set<String> cityList;
    
	/**
     * Gets the state.
     *
     * @return the state
     */

	public String getState() {
		return state;
	}
	
	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */

	public void setState(String state) {
		this.state = state;
	}

	/**
     * Gets the list of cities within state.
     *
     * @return the list of cities
     */

	
	public Set<String> getCityList() {
		return cityList;
	}
	
	/**
	 * Sets the list of cities within the state.
	 *
	 * @param cityList the new cityList
	 */

	public void setCityList(Set<String> cityList) {
		this.cityList = cityList;
	}

}
