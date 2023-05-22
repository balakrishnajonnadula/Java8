package com.bifunciton;

public class Employee {
	public int eNo;
	public String name;
	public int marks;
	public double salary;

	public Employee(int eNo, String name, int marks, double salary) {
		super();
		this.eNo = eNo;
		this.name = name;
		this.marks = marks;
		this.salary = salary;
	}

	public Employee(int eNo, String name, double salary) {
		super();
		this.eNo = eNo;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", name=" + name + ", salary=" + salary + "]";
	}

}
