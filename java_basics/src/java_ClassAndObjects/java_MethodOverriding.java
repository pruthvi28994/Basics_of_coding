package java_ClassAndObjects;
class animal{
	public void canEat() {
		System.out.println("Animal Can Eat food");
	}
	public void canMove() {
		System.out.println("Animal Can Move");
	}
}
class dog extends animal{
	public void canEat() {
		System.out.println("Dog eats dog food");
	}
	public void canMove() {
		System.out.println("Dog can Run");
	}
}
public class java_MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj=new dog();
		obj.canEat();
		obj.canMove();
		
		
	}

}
