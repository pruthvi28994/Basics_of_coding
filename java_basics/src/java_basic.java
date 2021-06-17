
public class java_basic {
	static String college;
	static {
		college="NMIT";
	}
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char a='A';
			byte b=2;
			short c =22;
			int d = 45;
			float e = 5.21123f;
			double f= 23.4444434343d;
			boolean g =true;
			System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
			
	}
	public static void display() {
		System.out.println(college);
//		System.out.println(name); { obj.name}
		// gives error because you are calling non static varible in static method
		//in case you wish to call non static variable then you need to create obj of class then you can call 
	}
}
