package com.class11;

public class TwoDArraysDemo2 {
public static void main(String[] args) {
	
	
	String[][]names= {
			{"khan","yousuf","alex","ali"},
			{"han","veli","deli","zili"},
			{"guli","duli","hali","telli"},
			
	};
	
	int lengthOfRows=names.length;
	System.out.println(lengthOfRows);
	
	int lengthOfCols=names[1].length;
	System.out.println(lengthOfCols);
	
	for(String getArrays[]: names) {
		for(String getName: getArrays ) {
			System.out.println(getName);
	}
		System.out.println();
}
}}
