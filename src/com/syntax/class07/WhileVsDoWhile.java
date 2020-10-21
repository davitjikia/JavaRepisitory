package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		 System.out.println("----------While Loop--------------");
		
		int a=20;
		
		//first we check condition
		
		while (a<15) {
			System.out.println("helo");
			a++;
		}
       System.out.println("----------Do While Loop--------------");
		
		int b=20;
		//first do something
		do {
			System.out.println("hi");
			b++;
		}while (b<15);  //then do something
		
		//repeats result once for sure.
	}

}
