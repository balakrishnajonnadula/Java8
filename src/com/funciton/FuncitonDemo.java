package com.funciton;

import java.util.ArrayList;
import java.util.function.Function;

public class FuncitonDemo {

	public static void main(String[] args) {
		Function<Employee, String> fun = (e) -> {
			int marks = e.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[DISTICTION]";
			else if (marks >= 65)
				grade = "B[FIRST CLASS]";
			else if (marks >= 50)
				grade = "C[SECOND CLASS]";
			else if (marks >= 35)
				grade = "D[THIRD CLASS]";
			else
				grade = "E[FAIL]";
			return grade;

		};

		ArrayList<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee(111, "jbk", 34, 8500));
		aList.add(new Employee(122, "vinni", 94, 8500));
		aList.add(new Employee(133, "Sai", 65, 8500));
		aList.add(new Employee(144, "Teja", 75, 8500));
		aList.add(new Employee(155, "Sreelu", 31, 8500));
		aList.add(new Employee(166, "kittu", 55, 8500));

		for (Employee emp : aList) {
			System.out.println("Id : " + emp.eNo);
			System.out.println("Name : " + emp.name);
			System.out.println("Marks : " + emp.marks);
			System.out.println("Grade : " + fun.apply(emp));
			System.out.println();
		}
	}

}
