package com.homedecore.online.repository;

import java.util.List;

import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.Product;

public interface IProductRepository {
	
	/*
	 * * add a new product
	 */
	public boolean addProduct(Product product) throws DatabaseOperationException;
	
	/*
	 * * display all products
	 */
	public List<Product> findAllProducts() throws DatabaseOperationException;
	
	/*
	 * * display all products by type
	 */
	public List<Product> findAllProductsByType(String type) throws DatabaseOperationException;
	
	/*
	 * * find product by id
	 */
	public Product findProductById(int id) throws DatabaseOperationException;
	/*
	 * * remove product by id
	 */
	public Product removeProduct(int id) throws DatabaseOperationException;
	
	/*
	 * * update product 
	 */
	public Product updateProduct(Product product) throws DatabaseOperationException;
	

}
