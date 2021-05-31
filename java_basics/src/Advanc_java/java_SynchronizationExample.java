package Advanc_java;

public class java_SynchronizationExample extends Thread{
	public void getMulti(int n) {
		//wont allow any other threads to execute until current thread die
		
		synchronized(this) {
			for(int i=1;i<=n;i++) {
				System.out.print(i*n+" ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// T ODO Auto-generated method stub

		java_SynchronizationExample t1=new java_SynchronizationExample();
		java_SynchronizationExample t2=new java_SynchronizationExample();
		java_SynchronizationExample t3=new java_SynchronizationExample();
		
//		getName() --> thread name
//		getId() --> thread id
//		setName() --> changing the name of the thread
		System.out.println();
		System.out.println("Thread started "+t1.getName());
		t1.start();
		t1.getMulti(5);
		System.out.println("Thread 1 exited without any interruption");
		System.out.println();
		System.out.println("Thread 2 started "+t2.getName());
		t2.setName("Thread_Pruthvi");
		System.out.println("Thread Name changed to "+t2.getName());
		t2.start();
		t2.getMulti(5);
		System.out.println("Thread 2 exited without any interruption");
		System.out.println();
		System.out.println("Thread started "+t3.getName());
		t3.start();
		t2.getMulti(5);
		System.out.println("Thread 3 exited without any interruption");
	}

}
