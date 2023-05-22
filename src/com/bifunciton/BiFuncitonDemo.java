package com.bifunciton;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFuncitonDemo {

	public static void main(String[] args) {
		BiFunction<Employee, Double, Double> biFun = (emp, sal) -> sal = sal + emp.salary;
		Predicate<Employee> fun = e -> e.salary < 1500;
		ArrayList<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee(111, "jbk", 2500.0));
		aList.add(new Employee(222, "BK", 1600.0));
		aList.add(new Employee(111, "jbk", 2900.0));
		aList.add(new Employee(224, "BK", 1300.0));

		for (Employee emp : aList) {
			if (fun.test(emp)) {
				System.out.println("Id : " + emp.eNo);
				System.out.println("Name : " + emp.name);
				System.out.println("Salary : " + biFun.apply(emp, 500.0));
				System.out.println();
			}
		}
	}

}
