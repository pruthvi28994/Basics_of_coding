package java_Collections;
import java.util.ArrayList;
public class java_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array List");
		System.out.println("1.integer array list");
		//dynamically allocates memory 
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(3);
		arraylist.add(2);
		System.out.println(arraylist);
		//removes the element form the index 3
		arraylist.remove(3);
		System.out.println("Size of the array list :"+arraylist.size());
		arraylist.add(6);
		
		//get(i) //fetch the element form the arraylist
		System.out.println(arraylist);
		System.out.println("Array list elements by iterating");
		for(int i=0;i<arraylist.size();i++) {
			System.out.print(arraylist.get(i)+" ");
		}
		
		System.out.println();
		arraylist.clear(); //removes all the elements from the array list
		System.out.println(arraylist);
		
		//string array list
		ArrayList<String> stringarray=new ArrayList<String>();
		stringarray.add("Pruthvi");
		stringarray.add("Bhavani");
		stringarray.add("Kumari");
		stringarray.add("Shivanna");
		System.out.println(stringarray);
		//iterate using for each 
		System.out.println("Iterating using for-each");
		for(String i:stringarray) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}




















