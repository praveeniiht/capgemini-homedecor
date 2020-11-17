package com.homedecore.online.service;

import com.homedecore.online.model.OrderedItem;

public interface IOrderedItemService {
	/*
	 * calculate the amount payable for ordered product
	 */ 
	public Double calculateAmountPayable(OrderedItem orderedItem);
	

}
