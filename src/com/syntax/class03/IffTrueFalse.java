package com.syntax.class03;

public class IffTrueFalse {

	public static void main(String[] args) {

		boolean isFriday = true;
		int date = 3;
		boolean isMonday = true;
		if (isFriday) {

			if (date == 13) {
				System.out.println("will watch scary moovie");
			} else {
				System.out.println("will watch pk");
			}

		} else {

			if (isMonday) {
				System.out.println("am not studing am working");

			} else {
				System.out.println("i have class syntax");
			}

		}
		System.out.println("_________________example 3___________");
		/*
		 * check if assignment is completed if assignment is complete: if score > 90--->
		 * great job if score > 80---> good job if score > 70---> please study more
		 */

		int score = 6;
		boolean assignment = false;
		if (assignment) {
			if (score > 90) {
				System.out.println("great job");
			} else if (score > 80) {
				System.out.println("good job");
			} else if (score > 70) {
				System.out.println("please study more");
			} else {
				System.out.println("good jub for trying bud deffinetly have to study more");
			}
		} else {
			System.out.println("u should do your all assignment");
		}
		System.out.println("_________________example 4___________");

		boolean diploma = true;
		double gpa = 5.0;

		if (diploma) {
			System.out.println("Congratulations");
			{
				if (gpa >= 3.5) {
					System.out.println("u are aligible for scolarship");
				} else {
					System.out.println("you should studied harder");
				}
			}

		} else {
			System.out.println("Get a degree");
		}
		System.out.println("_________________example 4___________");
		/*
		 * Create a Java program and store values of mortgage rate and price. First,
		 * program should check if rate is higher than 4,5, user will not buy a house.
		 * otherwise user will consider buying. Once user decides to buy a house, if
		 * price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash
		 */

		double mortgageRate, mortgagePrice;
		mortgageRate = 6;
		mortgagePrice = 1500000;

		if (mortgageRate > 4.5) {
			System.out.println("user can not buy house");

		} else {
			if (mortgagePrice > 200000) {
				System.out.println("need to get a loan");
			} else {
				System.out.println("will pay cash");
			}
		}
		System.out.println("_________________example 5___________");
	}
}