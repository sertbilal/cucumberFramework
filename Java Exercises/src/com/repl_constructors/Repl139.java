package com.repl_constructors;

public class Repl139 {
		String dogName;
		double dogWeight;
		static String dogBreed="Mutt"; 
		
		public Repl139(String name, String breed,double weight ) {
			dogName=name;
			dogBreed=breed;
			dogWeight=weight;
		}
		
		public Repl139(String name,double weight) {
			dogName=name;
			dogWeight=weight;
		}
		
		void display() {
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
		}}

