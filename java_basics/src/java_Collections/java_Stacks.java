package java_Collections;
import java.util.*;
public class java_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FILO
		Stack<Integer> stackDemo=new Stack<>();
		for(int i=0;i<5;i++) {
			stackDemo.push(i);
		}
		System.out.println(stackDemo);
//		stackDemo.pop(); //LIFO
		System.out.println("popped Element is :"+stackDemo.pop());
		System.out.println(stackDemo);
		System.out.println("size of the stack :"+stackDemo.size());
		System.out.println(stackDemo.capacity());
		Stack<Integer> stackNew=new Stack<>();
		stackNew.addAll(Arrays.asList(new Integer[]{10,12,44,22,10}));
		System.out.println("New stack USing addall :"+stackNew);
		System.out.println("top element is "+stackNew.peek());
		
	}

}
