package com.pruthvi.java.Aggregation;

public class java_AggregateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// here your creating the department object and it is aggregating to Employee
		Department dept = new Department(120, "Automation", "Mumbai");
		Emplyoee emp = new Emplyoee(1001, "Pruthvi", 56900.0, dept);
		emp.print();

		// printing using tostring method
		System.out.println("\n" + emp);

		// accessing the aggregated members using chaining methods
		System.out.println(emp.geteName() + " works for " + emp.geteDepartment().getdName());
		System.out.println();

		// there is problem in these
		// what if i create first employee and then department it will show null pointer
		// error
		Emplyoee emp1 = new Emplyoee();
		emp1.print();
		// Exception in thread "main" java.lang.NullPointerException:
		// Cannot invoke "java_Aggregation.Department.print()" because
		// "this.eDepartment" is null

		// issue solved by initializing the aggregate members always

	}

}
