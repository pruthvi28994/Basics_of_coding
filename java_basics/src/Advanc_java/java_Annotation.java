package Advanc_java;
class baseclass{
	public void hello() {
		System.out.println("Base class");
	}
}
public class java_Annotation extends baseclass{

	@Override        //override annotation
	public void hello() {
		System.out.println("MyCustom Annotation");
	}
	public static void main(String args[]){  
		//1Marker Annotation
		//2Single Value Annotation
		//3Multi Value Annotation
		System.out.println("Calling the anotation");
		
		
	}

}
