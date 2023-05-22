package com.bipridicate;

import java.util.function.BiPredicate;

public class BipredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) == 10;
		System.out.println(bp.test(2, 8));
		System.out.println(bp.test(9, 8));
	}

}
