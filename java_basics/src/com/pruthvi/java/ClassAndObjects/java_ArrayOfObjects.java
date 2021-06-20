package com.pruthvi.java.ClassAndObjects;

public class java_ArrayOfObjects {
	String name;
	int rollNo;

	java_ArrayOfObjects(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public void getDisplay() {
		System.out.println("UserName " + this.name + " Roll No " + this.rollNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array of objects");

		java_ArrayOfObjects[] obj = new java_ArrayOfObjects[5];
		obj[0] = new java_ArrayOfObjects("pruthvi", 134);
		obj[1] = new java_ArrayOfObjects("Bhavani", 129);
		obj[2] = new java_ArrayOfObjects("Jayanth", 128);
		obj[3] = new java_ArrayOfObjects("Sachin", 133);
		obj[4] = new java_ArrayOfObjects("Praveen", 90);
		System.out.println("Elements are :");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + " ");
			obj[i].getDisplay();
			System.out.println();
		}

	}

}
