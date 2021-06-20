
public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stores character in continous memory location
		// multiple way of creating string
		// 1
		String str = "Pruthvi";
		System.out.println("String using initialisation is :" + str);
		// 2
		String str1 = new String("Pruthvi Sagar S");
		System.out.println("Using object method:" + str1);

		// array
		int a[] = new int[2];
		a[0] = 2;
		a[1] = 3;
		System.out.println(a[0]);

		// tokens
		// keyword ,identifiers ,constants ,special symbols ,operators

		final int id = 5;
		System.out.println("constants :" + id);
//			id=3;    you get errror bcz final is like constant you cant change 
//			System.out.println(id);

		// type conversions
		// there is no problem in converting from smaller to larger
		int a1 = 100;
		System.out.println("int representation :" + a1);
		float b = a1;
		System.out.println("float representation :" + b);
		double c = b;
		System.out.println("Double representation ;" + c);
		// but when you are coming towards down you need to cast explicitly
		a1 = (int) c;
		System.out.println("int representation :" + a1);
		b = (float) c;
		System.out.println("Float reprsentation :" + b);

	}

}
