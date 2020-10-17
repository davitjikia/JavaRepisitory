package com.syntax.class02;

//shortcut to import Command+shift+o

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		int num = 80;
		String str = "am a String";

		Scanner scan = new Scanner(System.in); // enable input to the console

		System.out.println("PLease enter any text");
		String value = scan.nextLine();// waits for your input and once you provided input --> hit Enter buttom
		System.out.println("i captured value = " + value);

		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("my name is " + name);

	}

}
