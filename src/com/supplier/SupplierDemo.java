package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Date> sup = () -> new Date();
		System.out.println(sup.get());

		Supplier<String> otp = () -> {
			String otp1 = "";
			for (int i = 1; i <= 6; i++) {
				otp1 = otp1 + (int) (Math.random() * 10);
			}
			return otp1;
		};
		for (int i = 1; i <= 5; i++) {
			System.out.println(otp.get());
		}
	}

}
