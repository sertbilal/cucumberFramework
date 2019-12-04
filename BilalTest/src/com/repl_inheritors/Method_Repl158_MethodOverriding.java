package com.repl_inheritors;

public class Method_Repl158_MethodOverriding {
	 public static void main(String[] args) {
		   Child child= new Child();
		   child.Method();
		  }
}
class Parent{
	  public void Method (){
	    System.out.println("Parent method");
	  }
	}
class Child extends Parent{
	  public void Method(){
	    System.out.println("Child method");
	  }
	}


/**Method overriding
In Parent Class create a method with name method()
inside method write the logic as to print  "Parent method"
In Child Class first inherit to Parent Class and then create another method with name method() same as parent class; 
inside method write the logic as to print "Child method"
In Main Class create object of child class and call its method. 

Output 
Child method**/
