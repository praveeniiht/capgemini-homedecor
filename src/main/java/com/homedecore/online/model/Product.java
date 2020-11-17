package com.homedecore.online.model;
 
import java.io.Serializable;

public class Product implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The product number */
	private Integer productId;
	
	/** The product name */
	private String productName;
	
	/** The product rate per unit */
	private Double ratePerUnit;
	
	/** The quantity in hand  */
	private Double stockInHand;
	
	/** The product type i.e furniture, optical etc  */
	private String productType;
	
	/** The re-order-level */
	private Double reOrderLevel;
	
	/**
     * Gets the productId.
     *
     * @return the productId
     */
	public Integer getProductId() {
		return productId;
	}
	
	/**
	 * Sets the product id.
	 *
	 */

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	/**
     * Gets the productName.
     *
     * @return the productName
     */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Sets the product name.
	 *
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
     * Gets the rate per unit.
     *
     * @return the rate per unit
     */
	public Double getRatePerUnit() {
		return ratePerUnit;
	}
	
	/**
	 * Sets the product rate per unit
	 *
	 */
	public void setRatePerUnit(Double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	/**
     * Gets the stock in hand.
     *
     * @return the stock in hand
     */
	public Double getStockInHand() {
		return stockInHand;
	}
	/**
	 * Sets the quantity available in stock
	 *
	 */
	public void setStockInHand(Double stockInHand) {
		this.stockInHand = stockInHand;
	}
	
	/**
     * Gets the re-order level.
     *
     * @return the re-order level 
     */
	public Double getReOrderLevel() {
		return reOrderLevel;
	}
	/**
	 * Fixes the re-order level .
	 *
	 */
	public void setReOrderLevel(Double reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}
	
	/**
     * Gets the product type.
     *
     * @return the product  type
     */

	public String getProductType() {
		return productType;
	}
	
	/**
	 * Sets the type of product i.e furniture,optical etc;
	 *
	 */

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	
}
