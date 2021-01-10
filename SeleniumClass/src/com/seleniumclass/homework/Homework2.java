package com.seleniumclass.homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		 
		int i =1;
		int k =1; 
		
		System.out.println("******FOR LOOP*******");
		for(int j=1;j<=20;j++)
		{
			System.out.println(j);
		}
		
		
		System.out.println("******WHILE LOOP*******");
		///WHILE LOOP
		while (i<=20) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("******DO/WHILE LOOP*******");
		do{
			System.out.println(k);  
			k++;
		}
		while(k<=20); 
		
		
		System.out.println("******PROBLEM NUMBER 2*******");
		
		
		int s = 1;
		for (s=1; s<=20 ;s++) {
			
			if(s%5==0) {
			System.out.println (s);
		}
			}
		
		
		
		System.out.println("******PROBLEM NUMBER 3*******");
		
		int f = 1;
		for (f=1; f<=20 ;f++) {
			
			if(!(f%5==0)) {
			System.out.println (f);
		}
			}
		
		System.out.println("******PROBLEM NUMBER 4*******");
		//GUESS THE NUMBER 
		
		Scanner y = new Scanner(System.in);
		
		int w = 1; 
		while (w<=10) {
			System.out.println("Pick a number from 1 to 10");
		int guess= y.nextInt(10);
			if (guess<6) {
				System.out.println("That is incorrect. Guess again.");
			
			}
			else if (guess>6) {
				System.out.println("That is incorrect. Guess again.");
				
			}
			else if (guess==6) {
				System.out.println("That is correct.");
				break;
			}
			w++;
			
		}
		
	}

}

