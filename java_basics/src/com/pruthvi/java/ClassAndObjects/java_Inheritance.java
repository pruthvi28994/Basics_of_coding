package com.pruthvi.java.ClassAndObjects;

class vehical {
	public void canMove() {
		System.out.println("Vehical can Move");
	}

	public void hasEngine() {
		System.out.println("Vehicle has Engine");
	}

	public void fourWheel() {
		System.out.println("Vehicle is 4 wheeler");
	}

	public void twoWheel() {
		System.out.println("vehical is 2 Wheeler");
	}
}

//inheriting the vehical class
class car extends vehical {

	// making use of the methods overriding
	public void canMove() {
		System.out.println("Car can Move");
	}

	public void hasEngine() {
		System.out.println("Car has Engine");
	}
}

class bike extends vehical {
	public void canMove() {
		System.out.println("bike can Move");
	}

	public void hasEngine() {
		System.out.println("bike has Engine");
	}
}

public class java_Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the obj of inherited class
		car obj = new car();
		System.out.println("Inheritance Concept");
		obj.canMove();
		obj.hasEngine();
		obj.fourWheel();
		bike obj2 = new bike();
		System.out.println();
		obj2.canMove();
		obj2.twoWheel();
		obj2.hasEngine();
	}
}
