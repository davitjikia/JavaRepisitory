package com.syntax.class10;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the number of double values you want to enter");
		int arraySize=scan.nextInt();
		double[] num=new double[arraySize];
		double total = 0;
		System.out.println("Please enter the values you want to calculate the sum ");
		for(int i=0; i<num.length; i++) {
			num[i] =scan.nextDouble();
			total+=num[i];
		}
		System.out.println(total);
		System.out.println("---------------------------");
		}

}
