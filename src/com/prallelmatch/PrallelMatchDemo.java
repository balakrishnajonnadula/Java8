package com.prallelmatch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.bifunciton.Employee;

public class PrallelMatchDemo {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(

				new Employee(111, "jbk", 2500), new Employee(112, "bk", 3500), new Employee(113, "jbk", 4500),
				new Employee(114, "jbk", 500), new Employee(115, "jbk", 2800)

		);
		Comparator<Employee> comsal = (o1, o2) -> (o1.salary < o2.salary) ? 1 : (o1.salary > o2.salary) ? -1 : 0;
		list.stream().sorted(comsal).filter(e -> e.salary > 2500).forEach(e -> System.out.println(e));

		Employee[] emp = list.parallelStream().filter(e -> e.salary > 2500).toArray(Employee[]::new);
		System.out.println();

		for (Employee e : emp) {
			System.out.println(e);
		}

	}

}
