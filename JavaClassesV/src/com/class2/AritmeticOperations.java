package com.class2;

public class AritmeticOperations {
	/*
	 * declare 2 variable and initialize them 
	 * display result of perform addition, subtraction, multiplication and division
	 * 
	 */
	
  public static void main(String[]args) {
	  
	  int num1,num2;
	  
	  num1=20;
	  num2=10;
	  
	  System.out.println(num1+num2);//30
	  System.out.println(num1-num2);//10
	  System.out.println(num1/num2);//2
	  System.out.println(num1*num2);//200
	 // how can we print value of num1 and num2 together
	  System.out.println(num1+","+num2);
	   int sum=num1+num2;
	   int sub=num1-num2;
	   int mult=num1*num2;
	   int div=num1/num2;
	   System.out.println(sum);
	   System.out.println(sub);
	   System.out.println(mult);
	   System.out.println(div);
	  // the addition of 2 numbers is...
	   System.out.println("The addition of 2 number is "+ sum);
	  
  }
}
