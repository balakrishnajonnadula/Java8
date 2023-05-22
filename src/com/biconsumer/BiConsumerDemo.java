package com.biconsumer;

import java.util.function.BiConsumer;

import com.bifunciton.Employee;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<Employee, Double> biCon = (e, sal) -> System.out
				.println(e.eNo + "\t" + e.name + "\t" + (e.salary + sal));
		biCon.accept(new Employee(111, "jbk", 500), 500.0);
	}

}
