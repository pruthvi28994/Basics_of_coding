package java_Aggregation;

public class java_AggregateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//here your creating the department object and it is aggregating to Employee
//		Department dept=new Department(120, "Automation", "Mumbai");
//		Emplyoee emp=new Emplyoee(1001, "Pruthvi",56900.0, dept);
//		emp.print();
		
		//there is problem in these 
		//what if i create first employee and then department it will show null pointer error
		Emplyoee emp1=new Emplyoee();
		emp1.print();
		//xception in thread "main" java.lang.NullPointerException: 
		//Cannot invoke "java_Aggregation.Department.print()" because "this.eDepartment" is null
	}

}
