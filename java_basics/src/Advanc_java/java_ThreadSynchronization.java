package Advanc_java;

public class java_ThreadSynchronization extends Thread{
	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i+"thread created");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		in order to overcome the deadlock mechanism
//		bring out the mutual exclusive using lock mechanism 
		java_ThreadSynchronization t1=new java_ThreadSynchronization();
		java_ThreadSynchronization t2=new java_ThreadSynchronization();
		java_ThreadSynchronization t3=new java_ThreadSynchronization();
		t1.start();
		System.out.println("Threads will execute there wont be be any other thread interruption");
		try {
			t1.join();  //The join() method waits for a thread to die. 
			}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Thread will exceute randomly");
		t2.start();
		t3.start();
		
	}

}
