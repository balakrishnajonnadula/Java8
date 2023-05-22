package com.pridicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(10));// true
		System.out.println(predicate.test(5));// false

	}

}
