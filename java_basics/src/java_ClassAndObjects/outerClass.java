package java_ClassAndObjects;
public class outerClass{
	static int rollNo=10;
	static String name="pruthvi";
	String College="NMIT";
	static class Innerclass{
		public void display() {
			System.out.println("This is Inner Class");
			System.out.println("Roll No "+rollNo+" Name "+name);
		}
	}
	public class Innerclass2{
		public void display() {
			System.out.println("Hello this is non static Inner class");
			System.out.println("College Name :"+College);
		}
	}
}

