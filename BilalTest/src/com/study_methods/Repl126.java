package com.study_methods;
//Declare two private variables and assign the values as following in in Main Class. 
//Variables: 
//private int batch=3
//private String name="SyntaxSolutions"
//Then create one private method to print above declared variables value. 
//Then try to call the created method in your main method and run the program. 
//Make sure that you call the method you created in the main class ONCE.
//the output should be in same order as shown below. 
//Output: 
//3 SyntaxSolutions
public class Repl126 {
	private int batch = 3;
	private String name = "SyntaxSolutions";

	private void m1() {
		System.out.println(batch);
		System.out.println(name);
		//return;
	}

	public static void main(String[] args) {
	    Repl126 mm=new Repl126();
	        mm.m1();
	  
	}
}
