package com.class10;

import java.util.Scanner;

public class HW3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter first number");
	int firstNumber=scan.nextInt();
	System.out.println("enter second number");
	int secondNumber=scan.nextInt();
	 
		int start=0;
	    int end=0; 
	    
	    if (firstNumber<secondNumber) { //ctrl+shift+o(import kisayol)
	    start= firstNumber;
		end=secondNumber;
	}else {
		start=secondNumber;
	    end=firstNumber;
}
		int even=0;
		int odd=0;
		
		for(int i=start; i<=end; i++) {
			if (i%2==0) {
				even=even+i;
			}else {
				odd=odd+i;
				
			}
		}
		System.out.println("the sum of even numbers is "+ even);
		System.out.println("the sum of odd numbers is "+ odd);
	}
}

