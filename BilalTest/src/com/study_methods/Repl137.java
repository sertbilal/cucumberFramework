package com.study_methods;

//First declared the static class variable 
//static int a=100;
//then print the value
//then change the value to 200;
//then print the value
//again  change the value to 300;
//then print the value
//
//Output:
//100
//200
//300
public class Repl137 {
	static int a = 100;

	static void intValue() {
		System.out.println(a);
		a = a + 100;
	}

	public static void main(String[] args) {

//		System.out.println(a);
//		a = 200;
//		System.out.println(a);
//		a = 300;
//		System.out.println(a);
		
		Repl137.intValue();
		Repl137.intValue();
		Repl137.intValue();
	}
}
