package com.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FaltMapDemoTwo {

	public static void main(String[] args) {
		List<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(new Employee("jbk", 22208, 5000));
		emp1.add(new Employee("Bk", 22209, 3000));
		emp1.add(new Employee("Balakrishna", 22210, 2500));

		List<Employee> emp2 = new ArrayList<Employee>();
		emp2.add(new Employee("Vinni", 22211, 500));
		emp2.add(new Employee("vi", 22258, 2500));
		emp2.add(new Employee("chinni", 22256, 1500));

		List<Employee> emp3 = new ArrayList<Employee>();
		emp3.add(new Employee("sai", 22236, 500));
		emp3.add(new Employee("sreelu", 22219, 2500));
		emp3.add(new Employee("teja", 22230, 1500));

		List<List<Employee>> empList = new ArrayList<List<Employee>>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
//		using java8
		List<String> em = empList.stream().flatMap(emp -> emp.stream().filter(e -> e.salary >= 2500).map(e -> e.name))
				.collect(Collectors.toList());
		em.stream().forEach(System.out::println);
		System.out.println();

//		with out using java8
		for (List<Employee> emp : empList) {
			for (Employee e : emp) {
				if (e.salary < 2500)
					System.out.println(e.name + "\t" + e.id + "\t" + e.salary);

			}
		}
		
	}
}