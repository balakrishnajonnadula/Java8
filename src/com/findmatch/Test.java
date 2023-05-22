package com.findmatch;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
//		findAny() --> it will find the any one element in the list
//		if the list is empty it throws java.util.NoSuchElementException

		List<String> list = Arrays.asList("sysout", "sysout1", "sysout1", "sysout", "sysout3");
		Optional<String> findAny = list.stream().findAny();
		System.out.println(findAny.get());

//		findFirst()
		Optional<String> findFirst = list.stream().findFirst();
		System.out.println(findFirst.get());
	}

}
