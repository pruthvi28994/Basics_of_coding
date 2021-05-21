package java_ClassAndObjects;

public class java_Static {
	static {
		//for better understanding u can seee hello will print only once for any umber of object you create
		System.out.println("Hello ");
	}
	static String college="NMIT";
	static int count=0;
	int RollNo;
	String Name;
	
	static int getCount() {
		//remember static method can call only static variables 
		return count+=1; //in this case count is static
	}
	
	public java_Static(String Name,int RollNo) {
		this.Name=Name;
		this.RollNo=RollNo;
	}
	
	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return Name;
	}
	public String getCollege(){
		return college;
		
	}

	public void setName(String name) {
		Name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_Static[] obj=new java_Static[10];
		
		obj[0]=new java_Static("Pruthvi",134);
		obj[1]=new java_Static("Jayanth",129);
		 //memory for college will be allocated once for all objects
		System.out.println("No need to set value for college");
		
		//methods can be called using class name also
		System.out.println("Student "+java_Static.getCount()+"_"+obj[0].getCollege());
		System.out.println("Student "+java_Static.getCount()+"_"+obj[1].getCollege());
		System.out.println("NMIT is allocated to both students by default");

	}

}
