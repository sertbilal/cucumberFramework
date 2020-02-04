package com.repl_inheritors;

public class Method_Repl153_MethodOverloading {
	static void method1(int i){
	    System.out.println(i);
	  }
	  static void method1 (String str){
	     System.out.println(str);
	  }
	  static void method1(double d){
		    System.out.println(d);
		  }
	  static void method1(float f){
		    System.out.println(f);
		  }
	  public static void main(String[] args) {
	   
	  method1(100);
	  method1("SyntaxSolutions");
	  method1(100.09);
	  method1(200.0998);
	  }
	}
/**For you to do 

create multiple methods  with same name but should different parameters
method1 with int type parameter
method1 with String type parameter
method1 with double type parameter
method1 with float type parameter

and write the logic in that method to print respective value based on the parameter value you passed in the method type 
and call the method in main method with values 

Output should be

100
SyntaxSolutions
100.09
200.0998
**/