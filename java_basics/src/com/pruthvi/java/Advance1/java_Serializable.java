package com.pruthvi.java.Advance1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class java_Serializable implements Serializable {

	private String name;
	private int age;
	// version id in orderto differentiate the version type
	private static final long serialVersionUID = 1L;

	// **in order not to serialize particular variable use transient
	transient String college = "NMIT";

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public java_Serializable(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		is a mechanism of writing the state of an object into a byte-stream
		java_Serializable student = new java_Serializable("Pruthvi Sagar S", 23);

//		1.For serializing the object, we call the writeObject() 
//		method ObjectOutputStream,
////	2. and for deserialization we call the readObject()
//		method of ObjectInputStream class.

		String filename = "Test.txt";

		FileOutputStream fileout = null;
		ObjectOutputStream objout = null;
		// serialization
		try {
			fileout = new FileOutputStream(filename);
			objout = new ObjectOutputStream(fileout);

			// writing the file into the file using serializing
			objout.writeObject(student);

			objout.close();
			fileout.close();
			System.out.println("1 Objects has serialized:\n" + student);

		} catch (Exception e) {
			System.out.println("Error is :" + e);
		}

		try {
			FileInputStream filein = new FileInputStream(filename);
			ObjectInputStream objin = new ObjectInputStream(filein);

			// passing it after reading using readObject();
			java_Serializable studentafterread = (java_Serializable) objin.readObject();

			// printing the read files after typecasting it obj
			System.out.println();
			System.out.println("2 Deserialization of object:\n" + studentafterread);
			System.out.println();
			System.out.println("Check if college is serialized:" + studentafterread.getCollege());
			System.out.println("value is null for college bcz it is transient");
			objin.close();
			filein.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return ("Student Name:" + this.name + " Age:" + this.age);
	}

}
