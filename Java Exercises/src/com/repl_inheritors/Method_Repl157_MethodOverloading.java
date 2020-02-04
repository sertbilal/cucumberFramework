package com.repl_inheritors;

public class Method_Repl157_MethodOverloading {

	final void m1(boolean value) {
		System.out.println("Final method with boolean parameter");
	}

	final void m1(String value) {
		System.out.println("Final method with String parameter");
	}

	public static void main(String[] args) {
		Method_Repl157_MethodOverloading mm = new Method_Repl157_MethodOverloading();
		mm.m1(false);
		mm.m1("Syntax");
	}
}
/**
 * Create the two final method with same name First method with boolean
 * parameter Second method with String parameter
 * 
 * code to print below sentences.
 * 
 * call them in main method
 * 
 * output would
 * 
 * Final method with boolean parameter 
 * Final method with String parameter
 **/
