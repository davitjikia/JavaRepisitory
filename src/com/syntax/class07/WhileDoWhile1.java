package com.syntax.class07;

import java.util.Scanner;

public class WhileDoWhile1 {

	public static void main(String[] args) {

		// ask user what is his name 5 times ----> hello +name

		Scanner scan;
		String name;

		scan = new Scanner(System.in);

		int num = 1;

		while (num <= 5) {

			System.out.println("Please tell me your name");

			name = scan.next();

			System.out.println("Nice to meet you " + name);
			
			System.out.println("------------------------");

			num++;

		}
             System.out.println("---------------------------");
             
           
             
	}
}