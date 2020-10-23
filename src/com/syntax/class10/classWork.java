package com.syntax.class10;

public class classWork {

	public static void main(String[] args) {

		char[] Chars = new char[6];
		Chars[0] = 'A';
		Chars[2] = 'C';
		Chars[3] = 'D';
		Chars[4] = 'E';
		Chars[5] = 'F';

		System.out.println(Chars[5]);
		System.out.println("---------short way----------------");

		char[] index = { 'A', 'B', 'C', 'D', 'E', 'F' };
		

		System.out.println(index[1]);

		System.out.println("-------------------------");

		String[] names = new String[3];
		names[0] = "Davit";
		names[1] = "Ella";
		names[2] = "Tatiana";
		System.out.println(names[0]);
		System.out.println("----------short way---------------");

		String[] namess = { "Davit", "Ella", "Tatiana" };

		System.out.println(namess[0]);
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		String[] nammmes = { "Java", "Saturday", "day", "Coding" };
		System.out.println(nammmes[1] + " is " + nammmes[0] + " " + nammmes[3] + " " + nammmes[2]);

	}
        
        
        
        

}