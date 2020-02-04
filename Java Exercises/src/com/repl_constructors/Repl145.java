package com.repl_constructors;

public class Repl145 {

	String item;
	double price;
	double quantity;

	Repl145(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public double itemTotalPrice() {

		double itemTotalPrice = this.price * this.quantity;

		System.out.println(item + " Total Value " + itemTotalPrice);
		return itemTotalPrice;
	}

}
