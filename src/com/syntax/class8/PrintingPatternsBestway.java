package com.syntax.class8;

public class PrintingPatternsBestway {

	public static void main(String[] args) {

		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 6; b++) {
				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println("-----------------------");

		for (int c = 1; c <= 6; c++) {
			for (int d = 1; d <= 12; d++) {
				System.out.print("&");
			}

			System.out.println();
		}
		System.out.println("-----------------------");
		for (int g = 1; g <= 7; g++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print(j);
			}
			System.out.println();

		}

		System.out.println("-----------------------");
		for (int k = 1; k <= 7; k++) {
			for (int l = 1; l <= 8; l++) {
				System.out.print(k);
			}
			System.out.println();

		}
		System.out.println("-----------------------");
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= 6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for (int i = 5; i >= 1; i--) {
			for (int j = 7; j <= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}