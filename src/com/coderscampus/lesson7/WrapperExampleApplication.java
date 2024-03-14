package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main (String[] args) {
		
		/*
		 * byte = Byte
		 * short = Short
		 * int = Interger
		 * long = Long
		 * float = Float
		 * double = Double 
		 * char =  Character
		 * boolean = Boolean 
		 * 
		 */
		
		int primativeInt = 8;
		
		Integer warapperInt = 8; // auto boxing
		primiativeInt = new Integer(9);
		primitiveInt = Integer.valueOf(9); // unboxing 
		
		
		
		String someNumber = "123";
		String someOtherNumber = "456";
	
		 
		System.out.println(someNumber + someOtherNumber);
		System.out.println(Integer.parseInt(someNumber) + Integer.parseInt(someOtherNumber));
		
		Integer anotherIntWrapper = Integer.valueOf(8);
		
		Boolean someBoolean = null; 
		if (someBoolean == true) {
			System.out.println("True");
		} else
			System.out.println("False ");
		
	}
	
}