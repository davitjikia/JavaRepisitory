package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {

		int time = 15;

		if (time > 12) {
			System.out.println("Good day");

		}

		System.out.println("----------------WHILE  LOOP=-----------");

		while (time > 12) {

			System.out.println("Good day"); // infinite loop
			time--;// 3 times
		}

		while (time > 12) {

			System.out.println("Good day"); // infinite loop
			time++;
		}
		// i want to print numbers from 1 to 50
		System.out.println("PRINTING NUMBERS 1 TO 50 --------------");
		int num=1;
		
		while (num<=50) {
			System.out.println(num);
			num++;
		}
		
		// i want  to print numbers 100 to 60;
		int b=100;
		
		while (b>60) {
			System.out.println(b);
			b--;
		}
		
		int c=10;
		
		while (c<31) {
			if(c%2==0) {
			System.out.print(c+" ");
			// c++=========> if we keep increment here , we will get infinite(does not stop) loop
			
			}c++;
		
	}
	}
}