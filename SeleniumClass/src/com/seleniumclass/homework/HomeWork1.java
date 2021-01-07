package com.seleniumclass.homework;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
//		// largest of three numbers.
//		int a = 6;
//		int b = 4; 
//		int c = 8;
//		
//		if (a>b && a>c) {
//			
//			System.out.println("A is the largest number");
//		}
//		else if (b>a && b > c) {
//			System.out.println("B is the largest number");
//		}
//		
//		else {
//			System.out.println("C is the largest number");
//		}
//		
		
		
		//where user enters the two number and ask the operation user wants to perform 
		
		Scanner s = new Scanner(System.in);
		System.out.println("select two numbers");
		int Num1 = s.nextInt();
		int Num2 = s.nextInt();
		
		System.out.println("enter an operator");
		
		char Operator = s.next().charAt(0);
		int result; 
		 switch (Operator) {
	      case '+':
	        result = Num1 + Num2;
	        break;

	      case '-':
	        result =Num1 - Num2;
	        break;

	      case '*':
	        result = Num1 * Num2;
	        break;

	      case '/':
	        result = Num1 / Num2;
	        break;

	      default:
	        System.out.printf("Error! operator is not correct");
		 }
		
	   //return number is even or not.
		
//		int AA = 5; 
//		if (AA%2 == 0) {
//			System.out.println("The number is even");
//		}
//		else {
//			System.out.println("The number is odd");
//		}
	}

}
