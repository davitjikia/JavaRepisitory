package com.syntax.class02;

import java.util.Scanner;

public class Scc2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Is is sunny outside?");
		Boolean isSunny = input.nextBoolean();
		
		if (isSunny) {
			System.out.println("It is a sunny day, I should go somewhere");
			System.out.println("What is the temperature outside");
		int temp=input.nextInt();
		if(temp>85) {
			System.out.println("I am going to beach!");
		}else {
			System.out.println("I am going to park");
		}
			
			
		} else {
			System.out.println("I stay home and practice java");
		}

	}
}
