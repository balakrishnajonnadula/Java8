package com.consumer;

import java.util.function.Consumer;
import com.bifunciton.Employee;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Employee> con = e -> System.out.println(e);
		con.accept(new Employee(111, "jbk", 2500));	
	}

}
