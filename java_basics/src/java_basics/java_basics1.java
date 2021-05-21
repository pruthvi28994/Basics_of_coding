package java_basics;

public class java_basics1 {
				public static void main(String args[]) {
					System.out.println("Hello world!!!");
					//operators
					System.out.println("Operators");
					int result=12;
					System.out.println("Number is :"+result);
					result+=12;
					System.out.println("1.Addition:"+result);
					result*=3;
					System.out.println("2.Multiplication:"+result);
					result%=4;
					System.out.println("3.Modulous:"+result);
					result/=2;
					System.out.println("4.Division:"+result);
					//increment and decrement operater
					System.out.println("");
					System.out.print("Post-Increment:"+result++);
					System.out.println("to"+result);
					System.out.println("before Pre-Increment:"+result);
					System.out.println("pre-Increment:"+(++result));
					System.out.println("");
					//decrement
					System.out.println("Increments and Decrements");
					System.out.print("Post-Decrement:"+result--);
					System.out.println("to"+result);
					System.out.println("before Pre-decrement:"+result);
					System.out.println("pre-decrement:"+(++result));
					
					System.out.println("");
					//comparison operators
					int value1=1,value2=2;
					System.out.println("Comparison operators");
					if(value1==value2) System.out.println("Equal");
					if(value1<value2) System.out.println(value1+" is < "+value2);
					if(value1!=value2) System.out.println(value1+" is not equal to "+value2);
					if(value1==1 && value2==2) System.out.println("value1 is 1 and value2 is 2");
					if(value1==5 || value2==2) System.out.println("value2 is 2");
					
					System.out.println("");
					//bitwise operator
					System.out.println("Bitwise operators");
					int a=5,b=7;
					//5=0101 & 7=0111 ->0101 & 0111=0101 5
					System.out.println("1. And a&b="+(a&b));
					// 0101 | 0111 = 0111-> 7
					System.out.println("2.exclusive or a|b="+(a|b));
					// 0101 ^ 0111 = 0001   "only for two ones output will be 1"
					System.out.println("3.Inclusive or a^b="+(a^b));
					System.out.println("3.left shift a<<b="+(a<<b));
					System.out.println("4.Right Shif a>>b="+(a>>b));
					
					
					
				}
}
