package com.repl_constructors;

public class Repl141_1 {

	public static void main(String[] args) {
		Repl141 obj = new Repl141("Eggs", 3.0, "Produce", true, 10);
		obj.display();
		Repl141 obj2 = new Repl141("Paper Towels", 2.0, "misc", false, 24);
		obj2.display();
		Repl141 obj3 = new Repl141("Paper Towels", 2.0, null, false, 0);
obj3.display();
	}

}
