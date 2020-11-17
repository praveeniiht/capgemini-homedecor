package com.homedecore.online.service;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.Cart;

public interface ICartService {

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
	
	/*
	 * * find all carts by customer 
	 */
	public List<Cart> findAllCartByCustomerId(long id) throws DatabaseOperationException;

	/*
	 * * find all carts by month
	 */
	public List<Cart> findAllCartByMonth(int month) throws DatabaseOperationException;
	
	/*
	 * * find all carts by year
	 */
	public List<Cart> findAllCartByYear(int year) throws DatabaseOperationException;


}
