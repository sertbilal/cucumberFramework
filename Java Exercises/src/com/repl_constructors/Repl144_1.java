package com.repl_constructors;

public class Repl144_1 {
	public static void main(String[] args) {
	    
		Repl144 toyotaCar = new Repl144("Toyota 2019", 25000,100); 
	    toyotaCar.carStockValue();
	    Repl144 BMWCar=new Repl144("BMW 2019", 6529.8, 100 );
	    BMWCar.carStockValue();
	    
	    
	  }
	}

//In carObject class:
//Create instance variables as below.
//
//model
//price, 
//quantity
//
//Create a constructor that will initialize instance variables. 
//
//Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result. 
//
//run the application in Main Class
//
//Output:
//
//Toyota 2019 Stock Value 2500000.0
//BMW 2019 Stock Value 652980.0
//
//Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations. 