package com.syntax.class10;

public class ClassWork1 {

	public static void main(String[] args) {

		String[] cars = { "Bmw", "Toyota", "Niva", "Mercedes", "Dodge", "Ford" };

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");

		}

		System.out.println();
		System.out.println("-----------");

		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		System.out.println("-----------");

		int[] numbers = { 10, 10, 90, 600, 89 };

		for (int num : numbers) {
			System.out.print(num + " ");

		}
		System.out.println();
		System.out.println("-----------");

		boolean[] arrayOfBoolean = { true, true, false, true };
		for (boolean boo : arrayOfBoolean) {
			System.out.print(boo + " ");
		}

	}

}
