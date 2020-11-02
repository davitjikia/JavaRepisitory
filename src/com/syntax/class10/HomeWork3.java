package com.syntax.class10;

import java.util.Scanner;

public class homeWork3 {
	public static void main (String [] args) {
		
		Scanner scan=new Scanner(System.in);
		
		double [] num=new double[2];
		double sum;
		System.out.println("Please enter numbers");
		num[0]=scan.nextDouble();
		num[1]=scan.nextDouble();
		
		sum=num[0]+num[1];
		System.out.println(sum);
	}

}
