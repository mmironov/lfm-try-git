package com.restaurant;

import com.restaurant.items.*;
import com.restaurant.items.nonvegitems.NonVegSandwich;
import com.restaurant.items.vegitems.VegSandwich;
import com.restaurant.menu.*;
import com.restaurant.orders.*;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Item orangeJuice = new Juices("Juice Orange", 2.99);
//		Item strawberryJuice = new Juices("Juice Strawberry", 3.50);
//		Item peachJuice = new Juices("Juice Peach", 3.20);
//		Item waterMelonJuice = new Juices("Juice Watermelon", 3.90);
//		Item melonJuice = new Juices("Juice Melon", 3.90);		
		
		Item whiteTea = new Tea("Tea White", 5.00);
//		Item greenTea = new Tea("Tea Green", 4.50);
//		Item fruitTea = new Tea("Tea Fruite", 4.80);
//		Item blackTea = new Tea("Tea Black", 5.50);
		
		Item dolceGusto = new Coffee("Dolce Gusto Caffee", 10.00);
//		Item starBucks = new Coffee("Starbucks Caffee", 20.00);
//		Item richard = new Coffee("Richard Caffee", 30.00);
		
		Item mufuleta = new VegSandwich("Mufuleta Vegetarian Sandwich",
				6.50);
//		Item eggsAndCheese = new VegSandwich("Vegeterian Sandwich "
//				+ "with eggs and cheese", 5.50);
//		Item vegHotdog = new VegSandwich("Vegeterian Hotdog", 7.00);
		
		Item hotdog = new NonVegSandwich("Hotdog", 3.00);
//		Item hamburger = new NonVegSandwich("Hamburger", 5.50);
//		Item duneur = new NonVegSandwich("Duneur", 5.00);
		
		
		Menu.addItem(orangeJuice);
//		Menu.addItem(strawberryJuice);
//		Menu.addItem(peachJuice);
//		Menu.addItem(waterMelonJuice);
//		Menu.addItem(melonJuice);
		
		Menu.addItem(whiteTea);
//		Menu.addItem(greenTea);
//		Menu.addItem(fruitTea);
//		Menu.addItem(blackTea);
		
		Menu.addItem(dolceGusto);
//		Menu.addItem(starBucks);
//		Menu.addItem(richard);
		
		Menu.addItem(mufuleta);
//		Menu.addItem(eggsAndCheese);
//		Menu.addItem(vegHotdog);
		
		Menu.addItem(hotdog);
//		Menu.addItem(hamburger);
//		Menu.addItem(duneur);
		
		
		System.out.println("Hello!");
		Scanner choiceOfClient = new Scanner(System.in);
		System.out.println("The choices are:");
		System.out.println("1. Orange Juice");
		System.out.println("2. Tea White");
		System.out.println("3. Dolce Gusto");
		System.out.println("4. Mufuleta");
		System.out.println("5. Hotdog");
		System.out.println("Which is your choice: ");
		int numberOfClientChoice = choiceOfClient.nextInt();
		
		Item itemOrdered = null;
		
		switch (numberOfClientChoice) {
		case 1:
			itemOrdered = orangeJuice;
			break;
		case 2:
			itemOrdered = whiteTea;
			break;
		case 3:
			itemOrdered = dolceGusto;
			break;
		case 4:
			itemOrdered = mufuleta;
			break;
		case 5:
			itemOrdered = hotdog;
			break;
		default:
			break;
		}
		
		System.out.println();
		
		System.out.println("What quantity do you want:");
		int quantity = choiceOfClient.nextInt();
		
		PlaceOrder order = new PlaceOrder();
		Order firstOrder = new Order(itemOrdered, quantity);
		order.orderItem(firstOrder);
		order.printOrder(firstOrder);
		
		System.out.println("Your bill is " + (quantity * itemOrdered.getCost()) + "ˆ");
	}
}
