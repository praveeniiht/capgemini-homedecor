package com.homedecore.online.service;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.State;

public interface IStateService {

	/*
	 * * add a new state 
	 */
	public boolean addState(State state) throws DatabaseOperationException;
	
	/*
	 * * display all state names
	 */
	public List<State> displayAllStates() throws DatabaseOperationException;
	
	/*
	 * * display all city names witin a state
	 */
	public List<State> displayAllCitiesOfState(String state) throws DatabaseOperationException;
	
	/*
	 * * add a new  city  witin a state's  city list
	 */
	public boolean addCityOfState(String state,String city) throws DatabaseOperationException;

	/*
	 * * validate a city which exists within that state
	 */
	public boolean validateCityOfState(String state,String city) throws DatabaseOperationException;
	
	

	
	
}
