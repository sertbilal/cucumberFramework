package com.class7;

import java.util.Scanner;

public class Homework {
public static void main(String[] args) {
	//task 2 find the larger number using nested if 
	
	Scanner scan=new Scanner(System.in);
	System.out.println("pls enter 3 distinct numbers for nested if task");
	double no1 = scan.nextDouble();
	double no2 = scan.nextDouble();
	double no3 = scan.nextDouble();
	
	if (no1!=no2 || no2!=no3) {
	if(no1>no2) {
		
	       if (no1>no3){ //no1>no2 &&no1>no3
		System.out.println("largest number is first - " + no1);
	    }  else { //no1>no2 but no1<no3
		System.out.println("largerst number is third - " + no3);
	}
	     
	}else { //assuming no2>no1
		if (no2>no3) { //no2>no1 && no>no3 -->no2 =largest
			System.out.println("largest number is second - "+no2);
		}else { //no2>no1 but no2<no3
			System.out.println("largest number is third- " +no3);
		}
	}
	}else {
		System.out.println("number are equal");
	}
}
}
