package com.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(5);
		aList.add(10);
		aList.add(25);
		aList.add(30);
		aList.add(15);
		aList.add(20);
		List<Integer> l = aList.stream().filter(i -> i % 2 == 0).map(i -> i + 2).collect(Collectors.toList());
		l.stream().forEach(System.out::println);

//		Converting list to array using constructor reference  
		Integer[] arr = l.stream().toArray(Integer[]::new);

//		Printing array using streams
		Arrays.stream(arr).forEach(System.out::println);

//		converting array to list using stream
		List<Integer> list = Stream.of(arr).toList();
		System.out.println(list);
	}

}
