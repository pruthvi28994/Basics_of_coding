package java_basics;

public class java_basics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//control statements
		//you know if ifelse ifelseif nestedif
		
		int a=9,b=3;
		System.out.println("1.!Ternary operator!");
		int result= a>b ? a:b;
		System.out.println(result);
		
		System.out.println("2.!Switch Statements!");
		int mon=3;
		String month="";
		switch(mon) {
		case 1:month="January";
				break;
		case 2:month="Febrauary";
				break;
		case 3:month="March";
				break;
		case 4:month="April";
				break;
		case 5:month="May";
				break;
		default:System.out.println("Month is above may or Invalid choice");
		}
		System.out.println("Month Is:"+month);
		
	System.out.println("");
	//multi Dimentional Array 
	System.out.println("3.Multi Dimentional Array");
	System.out.println("2*2 matrix");
	int[][] multiArr1= {{1,2},{3,4}};
	for(int i=0;i<2;i++) {
		System.out.print("[");
		for(int j=0;j<2;j++) {
			System.out.print(multiArr1[i][j]+" ");
		}
		System.out.println("]");
	}
				//    ----z-------
	int[][][] arr={ { {1,2,3},{4,5,6} },{ {7,8,9},{10,11,12} } };
		      //   ------X----------   -------Y----------
	System.out.println("3*3 Matrix");
	System.out.println("1st row 2 column 3 axis is :"+arr[0][1][2]);
	
	System.out.println("");
	System.out.println("4.Loops");
	//looping for ,while ,do-while
	int num=1;
	System.out.println("while loop");
	while(num<1) {
		System.out.print(num+" ");
		num++;
	}
	System.out.println("");
	num=1;
	System.out.println("Do-while");
	do {
		System.out.print(num+" ");
		num++;
	}while(num<1);
	
	System.out.println("For Each Loop");
	for(int[] i:multiArr1) {
		System.out.print("[");
			for(int j:i) {
			System.out.print(j+" ");
	     }
	  System.out.println("]");
	}
	
	}
}
