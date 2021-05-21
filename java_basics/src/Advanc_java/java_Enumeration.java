package Advanc_java;
//enumeration is used to defined the constants
enum weeks{
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3);

	private int i;

	weeks(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}

	int getValue() {
		return i;
		
	}
}
public class java_Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weeks obj=weeks.MONDAY;
		System.out.println("Enumeration Using object");
		System.out.println("Enumertion Value :"+obj.getValue());
		System.out.println("Enumeration WEEK:"+obj.name());
		System.out.println("Enumeration a without obj");
		System.out.println("Enumeration WEEK:"+weeks.SUNDAY);
		System.out.println("Enumeration value:"+weeks.valueOf("SUNDAY"));
		for(weeks w:weeks.values()) {
				System.out.println("Enumaration Value:"+w+" "+w.getValue());
		}
		

	}

}
