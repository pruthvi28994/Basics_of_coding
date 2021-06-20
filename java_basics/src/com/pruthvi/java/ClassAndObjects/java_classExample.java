package com.pruthvi.java.ClassAndObjects;

public class java_classExample {
	String name;
	int rollNo;

	public java_classExample(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(name + "=>" + rollNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if construtor has parameter then you can use default constructor
		// this wont work java_classExample=new java_classExample();
		java_classExample obj = new java_classExample("pruthvi", 11);
		obj.display();
		obj.setName("jayanth"); // changing the name pruthvi to jayanth
		obj.display();
	}

}
