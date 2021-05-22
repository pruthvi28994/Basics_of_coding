package Advanc_java;

// using Thread class and extending it 
class threads extends Thread{
	//there are various stages in thread 
//	1. New    -->thread is created before excu of start()
//	2. Runnable    -->after invoc of start() but thread scheduler has not selected it to be running
//	3. Running	-->thread scheduler has selected thread
//	4.			{ Non Runnable {blocked} }  -->non executable block of code
//	5. terminate -->dead state
	@Override
	public void run() {
		try {
			System.out.println("1 Thread by extending Thread Class");
		}
		catch(Exception e) {
			System.out.println("Exception Raised"+e);
		}
	}	
}
// 	other way of creating thread using Runnable! implements because overcome MultipleInheritance
class threadsRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("2 Thread creation using runnable");
		}
		catch(Exception e) {
			System.out.println("Exception raised:"+e);
		}
		
	}
}
public class java_ConcurrencyThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//threads are lighweight process
//		multi-threaded execution is essential feature of java
		System.out.println("Block 1 Creation of new threads");
		{
			threads t1=new threads();
			t1.start();  //initatiing the thread
		//thread initialization using runnable
			Thread t2= new Thread(new threadsRunnable());
			t2.start();
//		threadsRunnable t3=new threadsRunnable();
//			t3.start();   //now u can't run bcz u did'nt initialize using main Thread class
		}
	
		System.out.println();
		System.out.println("Block 2 checking Sequential process");
		{
				System.out.println("Now lets loop and see how actually thread works");
				//running thread in loop
				for(int i=0;i<10;i++) {
					threads t3=new threads();
					t3.start();
					Thread t4= new Thread(new threadsRunnable());
					t4.start();
				}
			System.out.println();
			System.out.println("You can see that there is no sequential execution of threads");
			System.out.println("this is because threads run as when they find process free");
		}
//		
		System.out.println();
		System.out.println("Block 3 Invoking threads using run() method");
		{
			threads t5=new threads();
			Thread t6= new Thread(new threadsRunnable());
				for(int i=0;i<10;i++) {	
					t5.run();
					t6.run();
				}
			System.out.println("in these you can see threads excutes in sequential manner\n and it will be treated like objects");
			System.out.println("if you make you run method directly");
		}
	
	
	
	
	
	
	
	
	}

}
