package com.repl_constructors;

public class Repl145_1 {

	public static void main(String[] args) {
		Repl145 blancket = new Repl145("Blancket", 49.99, 2);
		Repl145 mattress = new Repl145("Mattress", 219.59, 2);
	
		double blancketTotal = blancket.itemTotalPrice();
		double mattressTotal = mattress.itemTotalPrice();
		double sumPurchase = blancketTotal + mattressTotal;
		System.out.println("You purchased " + sumPurchase + " Today");

	}

}

//In ShoppingStore class:
//Create class level variable as below.
//item,
//price, 
//quantity
//
//create one constructor with parameters of item, price and quantity. 
//in constructor assign the parameter value to class level value. (use this keyword). 
//
//Create a method with name itemTotalPrice. 
//write a logic to to calculate the total values of items in stock. 
//and print the result. 
//return the total value. 
//
//In Main Class. 
//
//Create two Object of ShoppingStore and pass the parameters to Constructor. 
//then using each object call the method itemTotalPrice. 
//Store the returned value of each object. 
//Calculate sum of both object and print the result. 
//
//Output:
//Blancket Total Value 99.98
//Mattress Total Value 439.18
//You purchased 539.16 Today
//
//
//Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  
//This Keyword, Method Creation, Mathematic Operations, method return types. 