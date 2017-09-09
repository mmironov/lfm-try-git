package com.restaurant.orders;

import com.restaurant.items.Item;

public class Order {
	
	String name;
	public int quantity;
	
	public Order() {
		this.name = "";
		this.quantity = 0;
	}
	
	public Order(Item item, int quantity) {
		this.name = item.toString();
		this.quantity = quantity;
	}
}
