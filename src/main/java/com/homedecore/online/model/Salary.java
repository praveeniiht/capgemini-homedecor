package com.homedecore.online.model;

import java.io.Serializable;

public class Salary implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersiognUID =1L;
	
	/** The id of salary slip of employee for a particular date    */
    private Long salarySlipId;

	/** The id of user also employee id   */
    private Long userId;

    /** The basic of employee    */
    private Double basic;

    /** The allownace of employee    */
    private Double allownace;
    
    /** The commission of employee    */
    private Double commission;

    /** The tax amount of employee    */
    private Double taxAmount;

    /** The take home amount of employee    */
    private Double net;
    
    /** The date of salary slip   */
    private String salarySlipDate;
    
    /**
     * Gets the salary slip Id.
     */

	public Long getSalarySlipId() {
		return salarySlipId;
	}
	 /**
     * Sets the salary slip Id.
     */

	public void setSalarySlipId(Long salarySlipId) {
		this.salarySlipId = salarySlipId;
	}
	/**
     * Gets the employee Id.
     */

	public Long getUserId() {
		return userId;
	}
	/**
     * Sets the employee Id.
     */

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	/**
     * Gets the employee basic amount.
     */

	public Double getBasic() {
		return basic;
	}
	
	/**
     * Sets the employee basic amount.
     */

	public void setBasic(Double basic) {
		this.basic = basic;
	}
	/**
     * Gets the employee allownace amount.
     */

	public Double getAllownace() {
		return allownace;
	}
	/**
     * Sets the employee allownace amount..
     */

	public void setAllownace(Double allownace) {
		this.allownace = allownace;
	}
	
	/**
     * Gets the employee commission amount.
     */
	public Double getCommission() {
		return commission;
	}
	
	/**
     * Sets the employee commission amount.
     */
	public void setCommission(Double commission) {
		this.commission = commission;
	}

	/**
     * Gets the employee tax amount.
     */
	public Double getTaxAmount() {
		return taxAmount;
	}
	
	/**
     * Sets the employee tax amount.
     */
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	/**
     * Gets the employee take home amount.
     */

	public Double getNet() {
		return net;
	}
	
	/**
     * Sets the employee take home amount.
     */
	public void setNet(Double net) {
		this.net = net;
	}
	
	/**
     * Gets the salary slip date.
     */

	public String getSalarySlipDate() {
		return salarySlipDate;
	}
	
	/**
     * Sets the salary slip date.
     */
	public void setSalarySlipDate(String salarySlipDate) {
		this.salarySlipDate = salarySlipDate;
	}

    

}
