package com.class6;

import java.util.Scanner;

public class ScannerSwitch {
	public static void main(String[] args) {
		/* ask user where they are from
		 * based on the country we will specify favorite food
		 */
		
		String country, foodName;
		
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("pls enter your country");

		country=scan.nextLine();
		 
		switch(country) {
		
		case "Turkey":
		      foodName="kebab";
		      break;
		case "ethiopia":
			   foodName="tibs";
			   break;
		case"morocco":
		       foodName="tajin";
			   break;
		default:
			   foodName="unknown";
		}
		System.out.println("you are from "+ country+" and your favorite food is "+foodName);
	}

}
