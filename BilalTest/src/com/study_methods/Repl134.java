package com.study_methods;
//Declare static variable in class level as below and assign it's value:
//String ss="Welcome To Syntax Solutions"
//then print it's value in you main method using three ways you learned so far
//Hint:
//first way: By calling directly
//Second way: By using the className
//Third way: By creating the object of the class
//Output:
//Welcome To Syntax Solutions
//Welcome To Syntax Solutions
//Welcome To Syntax Solutions
//***************************Benim Cozumum*******************
//public class Repl134 {
//	static String ss="Welcome To Syntax Solutions";
//	
//	static void ss(){
//	    System.out.println(ss);
//	  }
//	void ss(String ss){
//	    System.out.println(ss);
//	  }
//	  public static void main(String[] args) {
//		  Repl134 mm=new Repl134();
//		  mm.ss();
//		  System.out.println(mm.ss);
//		  System.out.println(ss);
//		 
//}}
//*************************Instructor's Solution*****************
	public class Repl134 {
static String ss="Welcome To Syntax Solutions";

public static void main(String[] args) {

  System.out.println(ss);
  System.out.println(Repl134.ss);
  
  Repl134 mm= new Repl134();
  System.out.println(mm.ss);
  
  

}
}