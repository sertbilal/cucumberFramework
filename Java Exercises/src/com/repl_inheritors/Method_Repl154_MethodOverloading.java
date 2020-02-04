package com.repl_inheritors;

public class Method_Repl154_MethodOverloading {
	public static void main(String arg1) {
        System.out.println("main " + arg1);
    }

    public static void main(String arg1, String arg2) {
        System.out.println("main " + arg1 + " " + arg2);
    }
  public static void main(String[] args) {
    
    main("Syntax");
    main("Syntax","Solutions");
    
  }
}


/**
Write program to overload main method
For you to do create the two more main method with different parameters and 
create one method with one string parameter
create the logic in it as "main " + parameter value
create another method with two string parameters
create the logic in it as "main" + parameters values
call that two methods in main method
 
Output should
main Syntax
main Syntax Solutions
**/