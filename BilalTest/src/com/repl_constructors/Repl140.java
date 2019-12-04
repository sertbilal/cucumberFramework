package com.repl_constructors;

public class Repl140 {
	
		  String make, model;
		  int numberOfDoors,topSpeed;
		  double price;
		  
		Repl140(String carMake , String carModel, int doors, int speed , double carPrice){
		    make=carMake;
		    model=carModel;
		    numberOfDoors=doors;
		    topSpeed=speed;
		    price=carPrice;
		    
		  }
		Repl140(String carMake , String carModel, int speed , double carPrice){
			numberOfDoors=4;
		}
		
		
		Repl140(int speed , double carPrice){
			make="unknown";
			model="unknown";
			}
		Repl140(String carMake , String carModel){
			topSpeed=90;
			price=0;
		}
		void display () {
			System.out.println(make +" "+ model+ " " +numberOfDoors +" "+ topSpeed +"  " + price);
		}
		}


