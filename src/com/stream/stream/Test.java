package com.stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		/*
		 * stream() filter map() collect() count() sorted() sorted(Comparator)
		 * min(Comparator) max(Comparator) forEach() toArray()
		 */

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(5);
		aList.add(10);
		aList.add(20);
		aList.add(15);
		aList.add(25);
		aList.add(30);
		List<Integer> list = aList.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
		// list to array conversion using constructor reference
		Integer[] integers = list.stream().toArray(Integer[]::new);// constructor reference
		System.out.println(integers.length);

	}

}
