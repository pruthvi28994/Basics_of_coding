package com.pruthvi.java.ClassAndObjects;

public class InnerClassDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in order to create the object of inner class we need to follow
		// below method
		// aliasing methods

		outerClass.Innerclass2 inobj = new outerClass().new Innerclass2();
		inobj.display();

		System.out.println();
		// important if inner class is static then inner class can use only static
		// variables
		// of outer class
		// can be instantiated as
		outerClass.Innerclass inobj2 = new outerClass.Innerclass();
		inobj2.display();

	}

}
