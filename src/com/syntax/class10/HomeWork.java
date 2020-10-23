package com.syntax.class10;

public class HomeWork {

	public static void main(String[] args) {

		String[] cars = { "Maserati", "Bmw", "Ferrari", "Mercedes", "Lamborgini" };

		for (int a = 0; a < cars.length; a++) {
			System.out.print(cars[a] + " ");
		}
		System.out.println();
		System.out.println("-------------Second way--------------");

		String[] carss = { "Maserati", "Bmw", "Ferrari", "Mercedes", "Lamborgini" };

		for (String car : carss) {
			System.out.print(car + " ");
		}

		System.out.println();
		System.out.println("-------------Therd way--------------");

		String[] carsss = new String[3];
		carsss[0] = "Maserati";
		carsss[1] = "Bmw";
		carsss[2] = "Ferrari";
		
		System.out.println(carsss[0]+" "+carsss[1]+" "+carsss[2]);
	}

}
