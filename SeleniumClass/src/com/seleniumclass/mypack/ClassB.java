package com.seleniumclass.mypack;


import com.seleniumclass.pack.ClassA1;

public class ClassB extends ClassA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA1 obj = new ClassA1();
	//	obj.msg();
		
		//////////////Does not access, It will only access with in the SAME PACKAGE////
		ClassB obj1 = new ClassB();
		obj1.msg1();
		
		///////You can access after using the "extends"///////////
		
	}

}
