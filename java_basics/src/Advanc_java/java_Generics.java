package Advanc_java;


//defining the Single Generic Class
class Generic_class1<T>{
	T obj;
	Generic_class1(T obj){
		this.obj=obj;
	}
	//returning the value 
	public T getObj() {
		return this.obj;
	}
}

//generics with two types ex maps vector of vectors etc
class Generic_class2<T , U>{
	T objT;
	U objU;
	Generic_class2(T objT,U objU){
		this.objT=objT;
		this.objU=objU;
	}
	public void Display_Genric() {
		System.out.println(this.objT+"-->"+this.objU);
	}
}

public class java_Generics {

	//allows us to reuse the same code with different inputs
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java_Generics");
		System.out.print("1 Integer Generic-->");
		Generic_class1<Integer> iobj=new Generic_class1<>(134);
		System.out.println(iobj.getObj());
		Generic_class1<String> Sobj=new Generic_class1<>("Pruthvi");
		System.out.println("2 String Generic-->"+Sobj.getObj());
		
		System.out.println();
		
		System.out.println("Now lets have Dual Generic class like maps ");
		Generic_class2<Integer,String> Mobj=new Generic_class2<>(129,"Bhavani S");
		System.out.println("Dual Generic values are:");
		Mobj.Display_Genric();
		
	}

}
