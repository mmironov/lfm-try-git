package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Glass;

public abstract class ColdDrinks implements Item{
	
	Category category = Category.Drinks;
	Glass container = new Glass();
	
	@Override
	public Category getCategory() {
		return category;
	}
	
	@Override
	public Container getContainer() {
		return container;
	}
}
