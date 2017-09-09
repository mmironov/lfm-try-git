package com.restaurant.items;

import com.restaurant.items.container.Container;

public interface Item {
	int getQuantity();
	void setQuantity(int quantity);
	String getName();
	Category getCategory();
	double getCost();
	Container getContainer();
}
