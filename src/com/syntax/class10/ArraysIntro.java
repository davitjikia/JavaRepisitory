package com.syntax.class10;

public class ArraysIntro {

	public static void main(String[] args) {

		// i have 5 students in the class and i need to calculate the average score

		int[] grades = new int[5];
		grades[0] = 98;
		grades[1] = 80;
		grades[2] = 89;
		grades[3] = 67;
		grades[4] = 77;

		int avarage = (grades[0] + grades[0] + grades[0] + grades[0] + grades[0]) / 5;
		System.out.println(avarage);

		double[] array;

		array = new double[3];
		array[0] = 12.99;
		array[1] = 10.89;

		System.out.println(array[2]);

		array[2] = 5.99;

		System.out.println(array[2]);

		// array[3]=7;
		// System.out.println(array[3]);

		String[] liquid = new String[4]; // arrays are ficxed in size
		liquid[2] = "Water";
		liquid[1] = "Tea";
		
		System.out.println(liquid[0]);

	}
}
