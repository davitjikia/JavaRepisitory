package com.syntax.class02;

import java.util.Scanner;

public class AritmeticOperation {

	public static void main(String[] args) {
		

		Scanner num=new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		
		int age=num.nextInt();
		 age+=10;
		System.out.println("Your age after 10 years is "+age);
		
	}

}