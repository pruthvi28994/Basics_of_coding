package com.pruthvi.java.ClassAndObjects;

class Encapsulation {

	// process of binding the data and data members together is called encapsulation
	private String name;
	private int rollNo;

	public Encapsulation(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void details() {
		System.out.println("RollNo " + rollNo + " UserName " + name);
	}
}

public class java_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation("Pruthvi", 134);
		obj.setName("Pruthvi Sagar S");
		obj.details();

	}

}
