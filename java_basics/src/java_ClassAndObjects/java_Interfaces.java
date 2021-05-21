package java_ClassAndObjects;

//there should not be any implementation of function in the body of interface
interface Engine{
	void power();
	void strokeDetails();
}
interface noOfWheels{
	void noOfWheel();
	void typeOfWheel();
}

//you cant have multiple inheritance  but you can by using INTERFACE
public class java_Interfaces implements Engine,noOfWheels{
    public void power() {
    	System.out.println("1. Kia Seltos 4500HP");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_Interfaces obj=new java_Interfaces();
		System.out.println("Multiple Inheritance with the Help of Interfaces");
		obj.power();
		obj.strokeDetails();
		obj.noOfWheel();
		obj.typeOfWheel();

	}
	@Override
	public void strokeDetails() {
		// TODO Auto-generated method stub
		System.out.println("2. 4 Stroke Disel Engine DTX");
	}
	@Override
	public void noOfWheel() {
		// TODO Auto-generated method stub
		System.out.println("3. 4 wheeler Car With additional extra Wheel");
	}
	@Override
	public void typeOfWheel() {
		// TODO Auto-generated method stub
		System.out.println("4. Apollo Fully syntetic 8line Tyre");
		
	}

}
