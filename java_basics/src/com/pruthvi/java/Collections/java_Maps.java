package com.pruthvi.java.Collections;

import java.util.*;
import java.util.Map.Entry;

public class java_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// key value pairs!!!!!!!!!
//		key must be unique and value might be duplicate value
		System.out.println("Maps Demo");
		HashMap<Integer, String> mapDemo = new HashMap<>();
		mapDemo.put(110, "Pruthvi");
		mapDemo.put(111, "Praveen");
		mapDemo.put(112, "Pruthvi"); // value might be duplicate
		mapDemo.put(113, "Kiran");
		mapDemo.put(114, "Jayanth");
		System.out.println("Size of the Map is =" + mapDemo.size());
		System.out.println(mapDemo);

		// check wther key is present or not
		if (mapDemo.containsKey(114)) {
			String value = mapDemo.get(114);// return the value
			System.out.println("value of the Key is " + value);

		}
		System.out.println("");
		// accesss using the for each loop
		System.out.println("Access using the for Each loop");

		for (int i : mapDemo.keySet()) {
			System.out.print(i + "=>" + mapDemo.get(i));
			System.out.println("");
		}

		System.out.println("");
		System.out.println("Access usin entery set");
		for (Entry<Integer, String> i : mapDemo.entrySet()) {
			System.out.println(i.getKey() + "=>" + i.getValue());
		}

	}

}
