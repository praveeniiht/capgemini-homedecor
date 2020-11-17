package com.homedecore.online.repository;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.User;

public interface IUserRepository {

	/*
	 * * add a new user 
	 */
	public boolean addUser(User user) throws DatabaseOperationException;
	
	/*
	 * * update a user if password or role is changed
	 */
	public boolean updateUser(User user) throws DatabaseOperationException;
	
	/*
	 * * remove user 
	 */
	public boolean removeUser(User user) throws DatabaseOperationException;

	/*
	 * * find user 
	 */
	public User findUserById(long id) throws DatabaseOperationException;
	
	/*
	 * * find all users 
	 */
	public List<User> findAllUsers() throws DatabaseOperationException;
}
