package java_Collections;

import java.util.*;
public class java_Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sorts automatically
		Queue<Integer> queueDemo=new PriorityQueue<>();
		queueDemo.add(12);
		queueDemo.add(1);
		queueDemo.add(3);
		queueDemo.add(14);
		System.out.println(queueDemo);
		System.out.println(queueDemo.peek());
		System.out.println("Removing element:"+queueDemo.remove());
		System.out.println(queueDemo);
		System.out.println("head elements is :"+queueDemo.poll());
		System.out.println(queueDemo);
		
	}

}
