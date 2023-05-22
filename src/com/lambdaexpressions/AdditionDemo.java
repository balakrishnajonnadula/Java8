package com.lambdaexpressions;

public class AdditionDemo {

	public static void main(String[] args) {
		AdditonInterface ad = (a, b) -> {
			return (a + b);
		};
		System.out.println(ad.add(9, 5));

	}

}
