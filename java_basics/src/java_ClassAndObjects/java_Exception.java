package java_ClassAndObjects;

public class java_Exception {

	//(errors:JVM Error ,Memory , Framework)
	//Exception Handling
//	-->IO- exception
//	-->SQL exception
//	-->class Not Found
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception Handling");
		//try 1
		try{
			int num=10/0;
			
		}catch(java.lang.ArithmeticException e) {
			System.out.println("Divide by zero"+e);
		}
		
		//try 2
		try {
			String name=null;
			char n=name.charAt(0);
		}
		catch( java.lang.NullPointerException e) {
			System.out.println("String is NUll or String is not handled properly");
		}
		finally {
			System.out.println("At ANY COST THESE IS EXECUTED");
		}

	}

}
