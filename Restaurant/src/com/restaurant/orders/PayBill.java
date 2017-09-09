package com.restaurant.orders;

public class PayBill {
	
	public static double payableAmount(Order order) {
		
		double bill = 0;
		bill = order.quantity;
		return bill;
	}
}
