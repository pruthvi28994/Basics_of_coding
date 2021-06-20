package com.pruthvi.java.Collections;

import java.util.*;

public class java_TreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ordered sortedset interface in java
		System.out.println("TreeSet");
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Pru");
		treeset.add("Bhav");
		treeset.add("Jay");
		treeset.add("Aru");
		System.out.println(treeset);

		System.out.println("Ordered Data Set");
		TreeSet<Integer> rollNO = new TreeSet<>();
		rollNO.add(2);
		rollNO.add(1);
		rollNO.add(-4);
		rollNO.add(8);
		System.out.println(rollNO);
		System.out.println(rollNO.equals(treeset));// comparison

	}

}
