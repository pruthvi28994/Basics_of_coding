package com.pruthvi.java.ClassAndObjects;

public class java_Constructors {
	double width;
	double height;
	double depth;

	// multiple constructors
	java_Constructors(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	java_Constructors(double width, double height) {
		this.width = width;
		this.height = height;
		this.depth = 20;
	}

	java_Constructors(double width) {
		this.width = width;
		this.height = width;
		this.depth = width;
	}

	public double volume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Multiple Constructors");
		java_Constructors obj1 = new java_Constructors(12.3, 11.8);
		System.out.println("volume =" + obj1.volume());
		java_Constructors obj2 = new java_Constructors(2);
		System.out.println("volume =" + obj2.volume());
	}

}
