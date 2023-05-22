package com.stream.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(5);
		aList.add(10);
		aList.add(25);
		aList.add(30);
		aList.add(15);
		aList.add(20);
//		Natural sorting order
		List<Integer> list = aList.stream().sorted().collect(Collectors.toList());
		list.stream().forEach(System.out::println);
		System.out.println();
		
//		Customized sorting order
		/*
		 * 1) (i1, i2) -> -i1.compareTo(i2)) 
		 * 2) (i1, i2) -> (i1 < i2) ? +1 : (i1 > i2) ? -1 : 0
		 * 3) Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? +1 : (i1 > i2) ? -1 : 0;
		 * 4) Comparator<Integer> c = (i1, i2) -> -i1.compareTo(i2)
		 */

		Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? +1 : (i1 > i2) ? -1 : 0;
		List<Integer> list1 = aList.stream().sorted(c).collect(Collectors.toList());
		
		list1.stream().forEach(System.out::println);
//		min()
		System.out.println(list1.stream().min((i1, i2) -> -i1.compareTo(i2)));
//		max()
		System.out.println(list1.stream().max((i1, i2) -> -i1.compareTo(i2)));
		
		List<Integer> list3 = aList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list3);
	}

}
