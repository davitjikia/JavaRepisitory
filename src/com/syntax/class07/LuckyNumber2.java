package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		int numFromUser;
		int luckyNumber = 7;
		scan = new Scanner(System.in);
		System.out.println("Enter number from 1 to 100");
		numFromUser = scan.nextInt();
		while (numFromUser != luckyNumber) {
			System.out.println("Enter number from 1 to 100");
			numFromUser = scan.nextInt();
		}
		System.out.println("The lucky number is " + numFromUser);
	}
}