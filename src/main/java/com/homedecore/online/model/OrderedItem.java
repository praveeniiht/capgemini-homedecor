package com.homedecore.online.model;

import java.io.Serializable;

public class OrderedItem implements Serializable {
		
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;
		
		/** The product number */
		private Integer productId;
		
				
		/** The product rate per unit */
		private Double ratePerUnit;
		
		/** The quantity ordered  */
		private Double orderedQuantity;
		
				
		/** The amount payable */
		private Double amountPayable;


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
	     * Gets the ordered quantity.
	     *
	     * @return the ordered quantity
	     */
		public Double getOrderedQuantity() {
			return orderedQuantity;
		}

		/**
		 * Sets the ordered quantity
		 *
		 */
		public void setOrderedQuantity(Double orderedQuantity) {
			this.orderedQuantity = orderedQuantity;
		}

		/**
	     * Gets the amount payable.
	     *
	     * @return the amount payable
	     */
		public Double getAmountPayable() {
			return amountPayable;
		}

		/**
		 * Sets the amount payable
		 *
		 */
		public void setAmountPayable(Double amountPayable) {
			this.amountPayable = amountPayable;
		}
		
		
		
}
