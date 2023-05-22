package com.lambdaexpressions;

import java.util.function.Function;

public class LambdaDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		Integer apply = f.apply(5);
		System.out.println(apply);
	}

}
