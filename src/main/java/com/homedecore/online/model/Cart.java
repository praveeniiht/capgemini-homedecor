package com.homedecore.online.model;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersiognUID =1L;
	
	/** The id of cart    */
    private Long cartId;
	
	/** The id of customer    */
    private Long userId;
    
    /** The date of cart    */
    private String cartDate;
	
	/** The list of ordered items   */
    private List<OrderedItem> itemList;
    
    /** The total amount payable  */
    private Double cartAmount;
    
    /** The customer credit card number   */
    private Long creditCardNumber;

    /**
     * Gets the cart Id.
     */
	public Long getCartId() {
		return cartId;
	}
	/**
     * Sets the cart Id.
     */

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

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
     * Gets the cart date.
     */

	public String getCartDate() {
		return cartDate;
	}
	/**
     * Sets the cart date.
     */

	public void setCartDate(String cartDate) {
		this.cartDate = cartDate;
	}
	/**
     * Gets the all ordered products
     */

	public List<OrderedItem> getItemList() {
		return itemList;
	}
	/**
     * Sets the all ordered products
     */

	public void setItemList(List<OrderedItem> itemList) {
		this.itemList = itemList;
	}

	/**
     * Gets the cart total amount.
     */
	public Double getCartAmount() {
		return cartAmount;
	}

	/**
     * Sets the cart total amount.
     */
	public void setCartAmount(Double cartAmount) {
		this.cartAmount = cartAmount;
	}

	/**
     * Gets the customer credit card number.
     */
	public Long getCreditCardNumber() {
		return creditCardNumber;
	}
	/**
     * Sets the customer credit card number.
     */

	public void setCreditCardNumber(Long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
    
}
