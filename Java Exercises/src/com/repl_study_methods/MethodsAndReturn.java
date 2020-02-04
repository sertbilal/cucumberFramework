package com.study_methods;

public class MethodsAndReturn {
//1.Method without return type and without arguments.
	public void add() {
		int a = 40;
		int b = 50;
		int c = a + b;
		System.out.println(c);
	}
//2.Method without return type and with arguments.	
	public void add(int a, int b){
		int c=a+b;
		System.out.println(c);
						}
	

	public static void main(String args[]) {
		MethodsAndReturn obj = new MethodsAndReturn();
		obj.add();//1.Method
		
		obj= new MethodsAndReturn();
		obj.add(13,24);//1.Method
		}
	}



	