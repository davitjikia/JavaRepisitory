package com.syntax.class02;

import java.util.Scanner;

public class Scc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		int num;
		double salary;

		scan = new Scanner(System.in);
		System.out.println("Enter numbers of worked ()");

		num = scan.nextInt();

		if (num >= 5) {
			System.out.println("User is aligible for the bonus");
			System.out.println("What is your salary?");
			salary = scan.nextDouble();
			{
				if (salary > 50000) {

					System.out.println("bonus=5000");
				} else {
					System.out.println("bonus=3000");

				}
			}
		} else {
			System.out.println("User is not aligible for the bonus");
		}

	}

}