package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Wrapper;

public abstract class Sandwich implements Item {
	Category category = Category.Snacks;
	Wrapper container = new Wrapper();

	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public Container getContainer() {
		return container;
	}
}
