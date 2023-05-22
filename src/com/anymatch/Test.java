package com.anymatch;

import java.util.Arrays;
import java.util.List;

public class Test {
	

	public static void main(String[] args) {
//		anyMatch()
		List<String> list = Arrays.asList("one match", "one matches", "two matches", "two match", "three match");
		boolean anyMatch = list.stream().anyMatch(s->s.length() > 9);
		System.out.println(anyMatch);
		
//		allMatch()
		boolean allMatch = list.stream().allMatch(s->s.startsWith("one"));
		System.out.println(allMatch);
//		noneMatch()
	}

}
