package com.pruthvi.java.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class java_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> rollNo = new HashSet<Integer>(); // Set is also fine instead of Hashset
		System.out.println("Sets");
		rollNo.add(134); // returns true if succesfully adds to set
		rollNo.add(89);
		rollNo.add(91);
		rollNo.add(129); // removes duplicate
		rollNo.add(129);
		System.out.println(rollNo);
		Set<String> names = new HashSet<String>();
		names.add("Pruthvi");
		names.add("Bhavani");
		names.add("Jayanth");
		names.add("Sachin");
		System.out.println(names);

		// add all u can use this function to add once
		Set<Integer> rollNoCopy = new HashSet<Integer>();
		rollNoCopy.addAll(rollNo);
		System.out.println("Duplicate of roll no Using Addall");
		System.out.println(rollNoCopy);
		System.out.println("or u can pass array to set ");
		Set<Integer> arrayAdd = new HashSet<Integer>();
		arrayAdd.addAll(Arrays.asList(new Integer[] { 91, 128, 1114, 134 }));
		System.out.println(arrayAdd);

		System.out.println("Intersection using retainAll()");
		arrayAdd.retainAll(rollNoCopy);
		System.out.println(arrayAdd);
		System.out.println("Difference Between using RemoveAll()");
		rollNoCopy.removeAll(arrayAdd);
		System.out.println(arrayAdd);
		System.out.println("check wther the element is present using Contains()");
		System.out.println("is 91 Contains in Set->" + arrayAdd.contains(91));
		System.out.println("Check if set Contains-> " + rollNoCopy.containsAll(rollNoCopy));
		System.out.println("After Remove");
		arrayAdd.remove(91);
		System.out.println(arrayAdd);

	}

}
