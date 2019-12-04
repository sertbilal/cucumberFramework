package com.repl_inheritors;

public class Method_Repl155_MethodOverloading {

	private void M1 () {
	       System.out.println("private m1 method");
	    }

	private void M2(int i) {
	        System.out.println("private m1 method with int parameter");
	    }
	  
	  public static void main(String[] args) {
		  Method_Repl155_MethodOverloading mm=new Method_Repl155_MethodOverloading();
	   mm.M1();
	   mm.M2(0);
	   
	    
	  }}
	
/** Create two private method
First method without parameter
Second method with int parameter
Write codes print out sentences as shown below. 
call them in main method. 
 
Output

private m1 method 
private m1 method with int parameter*/