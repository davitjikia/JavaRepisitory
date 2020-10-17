package com.syntax.class02;

import java.util.Scanner;

public class ForPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");

		Boolean rain = input.nextBoolean();

		if (rain) {
			System.out.println("please take an umbrella");
		} else {
			System.out.println("it is a nice weather take a walk");
		}
		System.out.println("________________________");
		
		System.out.println("please enter your age");
		int age=input.nextInt();
		System.out.println("my age is "+age);
	}
	

}
