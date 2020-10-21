package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// play a lottery where we need to enter number 1 to 20
        //lucky number is 7
        // keep asking  user to enter a number until entered number is same as lucky
		
		
		Scanner scan=new Scanner (System.in);
		int numbFromuser;
		int luckyNumber=7;
		
		do {
			
			System.out.println("Please enter any number from range 1-20 ");
			numbFromuser=scan.nextInt();
		} while (numbFromuser!=luckyNumber);
		
        System.out.println("you guassed the number ");
	}

}
