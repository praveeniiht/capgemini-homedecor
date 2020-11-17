package com.homedecore.online.repository;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.Cart;


public interface ICartRepository {
	/*
	 * * add  new Cart
	 */
	public boolean addCart(Cart cart) throws DatabaseOperationException;
	
	/*
	 * * display all carts
	 */
	public List<Cart> findAllCarts() throws DatabaseOperationException;
	
	
	/*
	 * * find cart by id
	 */
	public Cart findCartById(long id) throws DatabaseOperationException;
	


	

}
