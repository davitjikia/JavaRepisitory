package com.syntax.class07;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//task2
		
		Scanner scan=new Scanner(System.in);
		String response;
		
		do {
			System.out.println("Do you want to apply for credit card? ");
			response=scan.next();
			
		}while (!response.equalsIgnoreCase("yes"));
		
		System.out.println("you are selected");

	}

}
