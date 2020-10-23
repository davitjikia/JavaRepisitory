package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {

		String[] names = { "Mike", "Burju", "jack", "Danilo", "Bryan" };

		System.out.println(names[3]);

		// how do i know how many elements i have in the array?
		int size = names.length;
		System.out.println("Size of name array=" + size);

		System.out.println(names[names.length - 2]); // danilo;

		for (int i = 0; i < names.length; i++) {
			
			System.out.println(names[i]);
		}
	}

}
