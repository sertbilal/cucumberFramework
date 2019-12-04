package com.repl_inheritors;

public class Method_Repl159_MethodOverriding {
	
	public static void main (String []args){
	   
		    CChild child= new CChild();
		    child.add(100,200);
	  }
}
class  PParent{
	  void add(int firstNumber,int secondNumber){
		  int sum=firstNumber+secondNumber;
	    System.out.println(sum);
	  }
	}
class  CChild extends PParent{
	  protected void add(int firstNumber,int secondNumber){
		  int sum=firstNumber+secondNumber;
	    System.out.println(sum);
	  }
	}
/**Method Overriding 
Parent class create a method. name it as adding, include two int parameter (firstNumber, secondNumber)
inside method write logic to do adding operation of both parameters value and print the result. 

Child class first inherit to Parent class and then create a method. name it as adding, include two int parameter (firstNumber, secondNumber)
inside method write logic to do adding operation of both parameters value and print the result. 

In Main Class method create object with child class and call the child it's Method
pass the parameter values as 100, 200

Output:
300
**/