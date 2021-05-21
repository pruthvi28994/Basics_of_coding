package java_Collections;

import java.util.*;
public class java_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tree map automatically sorts the data based on key
		TreeMap<Integer,String> treemap=new TreeMap<>();
		treemap.put(3,"A");
		treemap.put(6, "C");
		treemap.put(5,"E");
		treemap.put(1,"D");
		System.out.println(treemap);
		System.out.println("ceiling value of key 4 is :"+treemap.ceilingKey(4)); //returns the ceiling key value of 4
		System.out.println(treemap.size());
		

	}

}
