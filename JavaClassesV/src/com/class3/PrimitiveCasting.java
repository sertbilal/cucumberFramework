package com.class3;

public class PrimitiveCasting {
	
	public static void main(String[]args) {
		double d=12;
		System.out.println(d);
		
		//int i=12.0; compile time error 
		
		// casting ; changing or converting one type to another
		//widening (implicit/automatic)
		//byte-->short-->int-->long-->float-->double
		
		//narrowing (explicit/ manual)
		//double-->float-->long-->int-->short-->byte
		
		// widening or automatic or implicit casting
		byte b=127;
		int i=b;
		//FYI - for your information
		int num=123;
		double d1=num;
		System.out.println(d1);
		//narrowing or explicit or manual casting 
		double d2=123.56;
		int num2=(int)d2;
		
		System.out.println(num2);
		
		int num3=550;
		byte b1=(byte)num3;
		System.out.println(b1);
		
	
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
