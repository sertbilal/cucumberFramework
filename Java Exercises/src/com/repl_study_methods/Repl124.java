package com.study_methods;
/*
 For you to do:
Please create methods with different access modifiers (one for each access modifier) 
and call them properly in main method one by one
 
In each method write the logic accordingly like for private method write the logic in the println 
Statement as "This is Private Method" accordingly for rest of the methods that have different 
access modifiers should be a total of 4 outputs, please make sure they are in the same order that is printed below.
Output:
This is Private Method
This is Default Method
This is Protected Method
This is Public Method
 */
public class Repl124 {

	 private void m1(){
		    System.out.println("This is Private Method");
		  }
		  void m2(){
		    System.out.println("This is Default Method");
		  }
		  protected void m3(){
		    System.out.println("This is Protected Method");
		  }
		  public void m4(){
		    System.out.println("This is Public Method");
		  }
		  
		  
		  public static void main(String[] args) {
		    
		    Repl124 m=new Repl124();
		    m.m1();
		    m.m2();
		    m.m3();
		    m.m4();
		  }
		}