package java_Collections;
import java.util.LinkedList;
public class java_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linked list
		System.out.println("Linked List");
		LinkedList<String> nameLinked= new LinkedList<String>();
		nameLinked.add("1NT17CS134");
		nameLinked.add("1NT17CS129");
		nameLinked.add("1NT17CS128");
		System.out.println("Normal Insertion :"+nameLinked);
		
		nameLinked.addLast("1NT17CS089"); //adds the elements at the last index;
		nameLinked.addFirst("1NT17CS001"); //adds at first position
		
		System.out.println("Inserting at first and last pos :"+nameLinked);
		nameLinked.add(2,"1NT17CS091"); //using index we can add to prescribed position
		
		System.out.println(nameLinked);
		
		nameLinked.remove(2); //remove using index position
		System.out.println("After removing from the index pos 2 :"+nameLinked);
		nameLinked.remove("1NT17CS128");
		System.out.println("After removing 1NT17CS128 :"+nameLinked);
		nameLinked.removeFirst();
		System.out.println("After removing First Ele :"+nameLinked);
		nameLinked.removeLast();
		System.out.println("After Removing Last Ele :"+nameLinked);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
