package com.restaurant.items;

public class Juices extends ColdDrinks {

	String name;
	double cost;
	int quantity;

	public Juices() {
		this.name = "";
		this.cost = 0.0;
		quantity = 0;
	}

	public Juices(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public int getQuantity() {
		return this.quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public String toString() {
		return name + ": " + cost + "ˆ/1pcs";
	}
}
