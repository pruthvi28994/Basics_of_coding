package com.pruthvi.java.ClassAndObjects;

import java.util.*;
import java.util.stream.Collectors;

public class java_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array Stream Maps");
		List<Integer> numberlist = new ArrayList<>();
		numberlist.add(12);
		numberlist.add(13);
		numberlist.add(11);
		numberlist.add(9);
		System.out.println(numberlist);
		System.out.println("Sqrt using list");
		List<Integer> sqrt = new ArrayList<>();
		for (int i : numberlist) {
			sqrt.add(i * i);
		}
		System.out.println(sqrt);
		System.out.println();
		System.out.println("same code using streams");
		List<Integer> stream = numberlist.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(stream);
		System.out.println();
		System.out.println("for sets");
		Set<Integer> setStream = numberlist.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(setStream);
		System.out.println();
		System.out.println("Stream APIs Filters");
		List<String> filters = new ArrayList<>();
		filters.add("c++");
		filters.add("python");
		filters.add("pythonFlask");
		filters.add("basics");
		filters.add("java");
		List<String> filterresult = new ArrayList<>();
		System.out.println("if fileters were not used");
		for (String i : filters) {
			if (i.startsWith("p")) {
				filterresult.add(i); // lengthy code if filters are not used
			}
		}
		System.out.println(filterresult);
		System.out.println("using filter only one line code");
		List<String> result = filters.stream().filter(s -> s.startsWith("p")).collect(Collectors.toList());
		// just one same operation using filters
		System.out.println(result);

		System.out.println();
		System.out.println("sort using Stream ApI");
		filters = filters.stream().sorted().collect(Collectors.toList());
		System.out.println(filters);
		System.out.println();
		System.out.println("iterating using StreamAPI");
		filters.stream().forEach(y -> System.out.println("Element is :" + y));

		System.out.println();
		System.out.println("Reduce functionality in StreamAPI");

		// when ever we need to convert the container of lists into single element we
		// make useof list
		int sum = numberlist.stream().reduce(0, (ans, i) -> ans + i);
		int product = numberlist.stream().reduce(1, (ans, i) -> ans * i);
		System.out.println("Sum of Elements=" + sum + " Prodcut of Elements=" + product);

	}

}
