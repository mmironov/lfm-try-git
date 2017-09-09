package com.restaurant.menu;

import java.util.ArrayList;

import com.restaurant.items.Item;

public class Menu {

	static ArrayList<Item> items = new ArrayList<>();

	public static void addItem(Item item) {
		items.add(item);
	}

	public static void displayItems() {
		System.out.println(items.toString());
	}

	public static ArrayList<Item> getItems() {
		return items;
	}

	public static void removeItem(Item item) {
		int itemIndexForDelete = 0;
		for(int i = 0; i < items.size(); ++i) {
			if(item.equals(item)) {
				itemIndexForDelete = items.indexOf(items.get(i));
				items.remove(itemIndexForDelete - 1);
			}
		}
	}
}
