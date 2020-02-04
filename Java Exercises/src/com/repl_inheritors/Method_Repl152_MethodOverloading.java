package com.repl_inheritors;

public class Method_Repl152_MethodOverloading {
	  static void method(){
	    System.out.println("method without parameter");
	  }
	  static void method(int a){
	     System.out.println("method with int parameter");
	  }
	  public static void main(String[] args) {
	   
	   method();
	   method(10);
	  }
	}
 
/**Write program to overload static method

Create the two static method with same name 
first method without parameter inside the method Print "method without parameter"
second method with an int parameter, inside the method print "method with int parameter"

call the method and check the output. 

output would 
 
method without parameter
method with int parameter*/