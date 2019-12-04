package com.repl_constructors;

public class Repl141 {
	
	String label;
	double price ;
	String category="misc";
	boolean hasExpiration=false;
	int stock; 
	
	Repl141(String prodLable , double prodPrice, String prodCategory, boolean prodExpiration , int prodStock) {
		label=prodLable;
		price=prodPrice;
		category=prodCategory;
		hasExpiration=prodExpiration;
		stock=prodStock;
	}
	Repl141(String prodLable , double prodPrice,int prodStock) {
		
	}
	
	Repl141(String prodLable , double prodPrice){
		
	}
	
	void display () {
		System.out.println(label +" "+ price+ " "+ category+" "+ hasExpiration +"  " + stock);
	}

}
