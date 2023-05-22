package com.stream.count;

import java.util.ArrayList;

public class CountDemo {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(5);
		aList.add(10);
		aList.add(25);
		aList.add(30);
		aList.add(15);
		aList.add(20);
		long count = aList.stream().filter(i -> i % 3 == 0).count();
		System.out.println(count);
	}

}
