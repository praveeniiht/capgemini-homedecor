package com.homedecore.online.service;

import java.util.List;

import com.homedecore.online.exceptions.BusinessException;
import com.homedecore.online.exceptions.DatabaseOperationException;
import com.homedecore.online.model.OrderedItem;
import com.homedecore.online.model.Product;

public interface IProductService {
	
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
	 * * issue product to customer cart
	 */
	public OrderedItem issueProduct(Product product,double orderedQuantity) throws DatabaseOperationException,BusinessException;
	
	/*
	 * * add stock of product 
	 */
	public void addStock(int productId,double addedQuantity) throws DatabaseOperationException,BusinessException;
	/*
	 * * display all products which are reached re-order level
	 */
	public List<Product> findLowStockProducts() throws DatabaseOperationException;
	
	


}
