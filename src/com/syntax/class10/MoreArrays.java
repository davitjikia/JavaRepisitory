package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };

		char sendValue = grade[1];

		String[] names = { "Mike", "Burju", "Jack", "Danilo", "Bryan" };
		String secondVal = names[1];

		// get all values from grade array

		for (int i = 0; i < names.length; i++) {
			String valueFromArray =names[i];
			System.out.print(valueFromArray+" ");
		}

	}

}
