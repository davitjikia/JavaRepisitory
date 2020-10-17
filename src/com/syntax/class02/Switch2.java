package com.syntax.class02;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * lets ask a tester on which browser they would like to use
		 */

		Scanner scan;
		String browser;
		String message;

		scan = new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser = scan.nextLine();

		switch (browser.toLowerCase()) { // browser.toLowerCase patara asosstan shedareba didis

		case "safari":
			message = "safari browser";
			break;

		case "chrome":
			message = "chrome browser";
			break;

		case "firefox":
			message = "firefox browser";
			break;

		default:
			message = "supported";

		}

		System.out.println(message);

	}

}
