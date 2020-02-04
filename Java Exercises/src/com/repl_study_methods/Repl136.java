package com.study_methods;
//create two methods follow steps
//Step 1: Create first method, should be a regular method without static keyword. 
//and have the logic to print out the following message
//"Programming is amazing."
//Step 2: Create second method. should be static method and write the logic to print out the following message:
//"Java is awesome."
//Step 3: try call this two method in main method
//Output:
//Programming is amazing.
//Java is awesome.
public class Repl136 {
	private static char[] mehod2;
	void method1(){
	    System.out.println("Programming is amazing.");
	  }
	  static void method2(){
	    System.out.println("Java is awesome.");
	  }
	  public static void main(String[] args) {
	    
		Repl136 mm=new Repl136();
	    mm.method1();
	    Repl136.method2();
	  }
	}

