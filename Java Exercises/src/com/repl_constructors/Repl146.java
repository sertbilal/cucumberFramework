package com.repl_constructors;

public class Repl146 {

	}


 class A{
	 void A(){
		 System.out.println(10);
	 }
 }
class B extends A{
	void B(){
		System.out.println(20);
	}
	 
 }

class C extends B{
	 void C(){
		 System.out.println(30);
	 }
}



/*1. Create three classes (A, B, C)
Write two constructors:

* Have a default constructor that prints out the following
For A:  "I"
For B: "am"
For C: "a tester"


Make C extend B
and B extend A

From your Main class create an object of the C class.


Output:
 
I
am
a tester*/