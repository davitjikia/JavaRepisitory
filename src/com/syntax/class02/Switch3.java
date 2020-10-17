package com.syntax.class02;

import java.util.Scanner;

public class Switch3 {
	/*
	 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
	 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
	 * should print which grade was entered by a user with explanation.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char grade;
		String message;

		System.out.println("enter grade");
		grade = scan.next().charAt(0);

		switch (grade) {
		case 'A':
			message = "A - Excellent";
			break;
		case 'B':
			message = "B- Good";
			break;
		case 'C':
			message = "C- Average";
			break;
		case 'D':
			message = "D-Bad";
			break;
		default:
			message = "Not Acceptavble";

		}
		System.out.println(message);
	}

}
