package com.study_methods;

public class Repl131 {

	int intValue;
	  double doubleValue;
	  char charValue;
	  
	  void first (int intValue ){
	    System.out.println(intValue);
	  }
	  void second(double doubleValue ){
	    System.out.println(doubleValue);
	  }
	  void third (char charValue){
	    System.out.println(charValue);
	  }
	  public static void main (String[] args) {
	    Repl131 mm=new Repl131();
	    mm.first(10);
	    mm.second(10.23);
	    mm.third('z');
	  }
}
