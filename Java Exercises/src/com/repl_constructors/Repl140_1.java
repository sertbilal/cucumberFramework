package com.repl_constructors;

public class Repl140_1 {
	public static void main(String[] args) {
		
	Repl140 obj1=new Repl140("Toyota", "Prius", 4, 120, 30000.0);
	obj1.display();
	Repl140 obj2=new Repl140("Toyota", "Prius", 4, 120, 30000.0);
	obj2.display();
	Repl140 obj3=new Repl140("Unknown", "Unknown", 4, 120, 30000.0);
	obj3.display();
	Repl140 obj4=new Repl140("Toyota", "Prius", 4, 90, 0.0);
	obj4.display();
	
	
	
	
	
	/* Toyota Prius 4 120 30000.0
	   Toyota Prius 4 120 30000.0
	   unknown unknown 4 120 30000.0
	   Toyota Prius 4 90 0.0         */
}
}