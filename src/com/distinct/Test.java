package com.distinct;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		distinct() is useful to remove the duplicates..!
		List<String> aList = Arrays.asList("a", "b", "cc", "ddd", "eea", "aaaa","a", "b");
		aList.stream().distinct().forEach(System.out::println);
		
//		
		String string = aList.stream().reduce((id,auth)->id + auth).get();
		System.out.println(string);
	}

}
