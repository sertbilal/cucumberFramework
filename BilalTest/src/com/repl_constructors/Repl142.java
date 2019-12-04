package com.repl_constructors;

public class Repl142 {
	
	String schoolName;
	int batch;
	String year;
	String lastDayOfClass;
	
	Repl142 (){
		
		}
	
     Repl142 (String sName, int numBatch, String schoolYear, String finalDay){
    	schoolName=sName;
 		batch= numBatch;
 		year= schoolYear;
 		lastDayOfClass=finalDay; 
     }
	
	
     void display(){
		System.out.println(schoolName +" "+ batch+ " "+ year+" "+ lastDayOfClass);
	}
	

}

//1. Complete the SyntaxTechnologies.java class:
//
//Include the following class variables:
//* schoolName(String)
//* batch(int)
//* year(String)
//* lastDayOfClass(String)
//
//Write two constructors:
//* non-argument constructor
//* parameterized constructor
//
//Create two different objects of the SyntaxTechnologies class using both constructors and print the values of the properties inline
//
//Output:
// 
//null 0 null null
//Syntax 4 2019 07/30/2019
