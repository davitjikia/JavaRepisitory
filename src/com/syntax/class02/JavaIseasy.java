package com.syntax.class02;

import java.util.Scanner;

public class JavaIseasy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("is evrything on sale? true/false");
		double discount = 0;
		boolean sale = scan.nextBoolean();

		if (!sale) {
			System.out.println("no shoping");
		} else {
			System.out.println("how much is the item");
			double price = scan.nextDouble();
			if (price >= 10 && price < 50) {
				discount = 0.1;
			} else if (price >= 50 && price < 100) {
				discount = 0.2;
			} else if (price >= 500) {
				discount = 0.5;
				System.out.println("the final price with the discount is " + (price - (price * discount)));
			}
		}
	}

}
