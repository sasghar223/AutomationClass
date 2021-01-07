package com.seleniumclass.operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// logical operators
//
//		// && AND
//
//		boolean a = true;
//		boolean b = false;
//
//		if (a && b) {
//			System.out.println("true");
//
//		} else {
//			System.out.println("false");
//		}
//
//		// ||OR
//
//		boolean AA = true;
//		boolean BB = false;
//
//		if (AA || BB) {
//			System.out.println("true");
//
//		} else {
//			System.out.println("false");
//		}
//
//		// ! "NOT"
//		boolean AAA = true;
//		boolean BBB = false;
//
//		if(! (AAA && BBB)) {
//
//			System.out.println("true");
//
//		} else {
//			System.out.println("false");
//		}

		// Getting Input from user

		Scanner s = new Scanner(System.in);
		int days = s.nextInt();
		switch (days) {

		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tues");

		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thrus");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("Invalid");

		}
	}

}
