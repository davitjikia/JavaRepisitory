package com.syntax.class02;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		double inch;
		int day;
		input = new Scanner(System.in);
		System.out.println("Personal heights in inches");
		inch = input.nextDouble();
		if(inch>0 && inch<=60) {
			System.out.println("short");
		}else if(inch>=60 && inch<72) {
			System.out.println("medium");
		}else if(inch>72) {
			System.out.println("tall");
		}
		System.out.println("____________________________");
		input = new Scanner(System.in);
		System.out.println("It is a weekend or weekday?");
		System.out.println("give me a number");
		int num=input.nextInt()	;
		if(num>=1 && num<=5) {
			System.out.println("weekday");
		}else if(num==6 || num==7) {
			System.out.println("weekend");
		
	}else {
		System.out.println("Invalid day");
		
		
		
	}
}
}