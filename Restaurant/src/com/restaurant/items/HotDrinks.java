package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Cup;

public abstract class HotDrinks implements Item{
	
	Category category = Category.Drinks;
	Cup container = new Cup();
	
	@Override
	public Category getCategory() {
		return category;
	}
	
	@Override
	public Container getContainer() {
		return container;
	}
}
