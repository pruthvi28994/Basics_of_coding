package com.pruthvi.java.Aggregation;

public class Emplyoee {
	private int eId;
	private String eName;
	private double eSalary;

	// Aggregating the Department class
//	private Department eDepartment;
	// in order to over come null pointer error

	private Department eDepartment = new Department(); // now it will print null values not showing errors
	// Always make sure you initialize the aggregate members

	public Emplyoee() {
	}

	public Emplyoee(int eId, String eName, double eSalary, Department eDepartment) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDepartment = eDepartment;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public Department geteDepartment() {
		return eDepartment;
	}

	public void seteDepartment(Department eDepartment) {
		this.eDepartment = eDepartment;
	}

	public void print() {
		System.out.println("Employee Information");
		System.out.println("Emp Id " + eId);
		System.out.println("Emp Name " + eName);
		System.out.println("Emp Salary " + eSalary);

		// calling the department class methods
		eDepartment.print();
	}

	@Override
	public String toString() {
		return "Emplyoee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eDepartment=" + eDepartment
				+ "]";
	}

	// if you want to print object as string

}
