package Advanc_java;

//auto boxing is the automatic conversion that the java compiler
//makes the primitive types and their corresponding object wrapper class
public class java_AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int to Integer ,double to Double ,char to Character etc
//		these is because int is primitive datatype and Integer is object
		int i=10;
		Integer obj=Integer.valueOf(i);
		System.out.println("Auto Boxing the int i");
		System.out.println(obj);
		System.out.println("Auto Unboxing the int i");
		i=obj;
		System.out.println(i);
		char a='p';
		Character objc=Character.valueOf(a);
		System.out.println("Auto boXing the char a \n"+objc);
		System.out.println("Auto Unboxing the character a\n"+a);
	}

}
