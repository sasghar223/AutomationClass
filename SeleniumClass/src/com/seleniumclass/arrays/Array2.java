package com.seleniumclass.arrays;

public class Array2 {

	public static void main(String[] args) {
		int []num = new int[10];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;
		num[7] = 8;
		num[8] = 9;
		num[9] = 10;
		
		int sum=0;
		for(int i=0; i<num.length; i++) {
		sum = sum + num[i];
		//1=0+1
		//  3= 1+2
		}
		System.out.println(sum);
		
		

	}

}
