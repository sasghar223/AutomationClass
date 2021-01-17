package com.seleniumclass.accessmod1;

public class PublicModifier {

	public static String msg="Learning Static variable";
	public static void display(){
	System.out.println("Learning static method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(); 
	}

	public void create(){
		System.out.println("m overridden method");
		}
}
