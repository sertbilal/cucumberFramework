package com.repl_constructors;

public class Repl144 {
	
	String model;
	  double price;
	  int quantity;
	  Repl144(String model, double price, int quantity) 
	    { 
	        this.model = model; 
	        this.price = price*quantity; 
	        this.quantity= quantity;
	    } 
	  
	    void carStockValue() 
	    { 
	        //Displaying value of variables a and b 
	        System.out.println(model+ " Stock Value  " + price); 
	    } 
	  
	}
//Instructor cozumunde farkli 
//public void carStockValue(){
//    
//    double stockValue = this.price * this.quantity; 
//    
//    System.out.println(model + " Stock Value " + stockValue);
//  }