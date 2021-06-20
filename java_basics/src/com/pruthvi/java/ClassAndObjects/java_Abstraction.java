package com.pruthvi.java.ClassAndObjects;

abstract class smartphone {
	// only can declare the method
	// cannot be instantiated
	// can have method which are already defined

	// if any class that is using this abstract class and defining all the
	// abstract methods then java throughs error and that class become abstract
	// again
	int ram, rom;

	void smartPhoneDetail(int ram, int rom) {
		this.ram = ram;
		this.rom = rom;
		System.out.println("Smart Phone Has ROM" + rom + "GB RAM " + ram + "GB");
	}

	abstract void call();

	abstract void hasCamera();

}

public class java_Abstraction extends smartphone {

	// extract the data by hiding the background Details
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_Abstraction obj = new java_Abstraction();
		obj.smartPhoneDetail(8, 128);
		obj.call();
		obj.hasCamera();

	}

	@Override
	void call() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi cell can call");
	}

	@Override
	void hasCamera() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi  has camera feature 34MP Front Camera 108MP rear Camera");
	}

}
