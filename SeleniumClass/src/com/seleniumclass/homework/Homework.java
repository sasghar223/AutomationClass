package com.seleniumclass.homework;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// division of two float numbers.
		float number1 = 1.23f;
		float number2 = 2.345f;
		float V1 = number1/ number2;
		System.out.println("This is problem One : "+V1);
		
		//display area of a circle.
		float pie = 3.14f;
		int num = 2;	

		float V12 = pie*num*num;
		System.out.println("This is problem two : "+V12);

		//fahrenheit to Celsius conversion 
		
		float divide = 0.555f;
		int fah = 36;	
		float V13 = fah-32;
		float V2 = V13*divide;
	  	System.out.println("This is problem three : "+V2);

	  	//your name and length of your name
	  	
	  	String FirstName = "Seemal";
	  	System.out.println("This is problem four : "+FirstName + ":"+FirstName.length());
	  	

	  	//print two Strings 
	  	String firstname = "Seemal";
		String Lastname = "Asghar";
		System.out.println("This is problem five : "+firstname + " " +Lastname);

		
		//minimum age required to apply 
		int johnAge = 20; 
		
		if (johnAge >= 18) {
			System.out.println("This is problem six : "+ "true");
	
		}
		
		if (johnAge <= 18) {
			System.out.println("This is problem six : "+ "False");
		
			
			
		}
		
	}

}
