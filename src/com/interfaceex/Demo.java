package com.interfaceex;

interface Interf {
	public void run();

	static void walk() {
		System.out.println("Walk from the interface..!");
	}
}

public class Demo {

	public void swim() {
		System.out.println("from demo swimming..!");
	}

	public static void main(String[] args) {
		Interf interf = new Interf() {
			@Override
			public void run() {
				System.out.println("Hello Innerclass....!");
			}
		};
 
		interf.run();
		Interf.walk();
	}

}
