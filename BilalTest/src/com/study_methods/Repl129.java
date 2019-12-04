package com.study_methods;
//Declare below variables in your main class as below. 
//
//int batch=3;
//String InstituteName="SyntaxSolutions"
//int year=2019;
//then print out the variables value in main method. 
//this will require creating an object of the class. to make use of your instance variables
//Output sequence:3
				//SyntaxSolutions
				//2019
public class Repl129 {

	int batch = 3;
	String InstituteName = "SyntaxSolutions";
	int year = 2019;

	public static void main(String[] args) {
		Repl129 mm = new Repl129();
		System.out.println(mm.batch);
		System.out.println(mm.InstituteName);
		System.out.println(mm.year);

	}

}
