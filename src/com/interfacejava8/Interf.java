package com.interfacejava8;

public interface Interf {
	static int i = 100;

	public static void run(int i) {

		System.out.println("Run from interf : " + i);
	}

	public static void walk() {
		System.out.println("walk from interf");
	}

	public static void main(String[] args) {
		run(10);
		walk();
	}

}
