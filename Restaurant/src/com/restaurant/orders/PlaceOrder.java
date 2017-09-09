package com.restaurant.orders;

import java.util.ArrayList;

import com.restaurant.items.Item;
import com.restaurant.menu.Menu;

public class PlaceOrder {
	
	ArrayList<Order> orders = new ArrayList<>();
	ArrayList<Item> availableItems = new ArrayList<>();
	
	public PlaceOrder() {
		orders = new ArrayList<Order>();
		availableItems = new ArrayList<Item>();
	}
	
	public PlaceOrder(Menu menu) {
		this.orders = new ArrayList<Order>();
		this.availableItems = Menu.getItems();
	}
	
	public void orderItem(Order order) {
		boolean availableItem = false;
		
		for(int i = 0; i < Menu.getItems().size(); ++i) {
			if(Menu.getItems().toString().contains(order.name)) {
				availableItem = true;
				break;
			}
		}
		
		if(availableItem) {
			Order firstOrder = new Order();
			orders.add(firstOrder);
		}
	}
	
	public ArrayList<Order> getOrder() {
		return orders;
	}
	
	public void printOrder(Order order) {
		System.out.println("Your choice is " + order.name);
	}
}
