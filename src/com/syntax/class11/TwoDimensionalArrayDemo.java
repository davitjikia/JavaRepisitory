package com.syntax.class11;


public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		
		char [][] $array=new char [3][4];
		
		// add values to first row
		
		$array[0][0]='A';
		$array[0][1]='B';
	    $array[0][2]='C';
		$array[0][3]='D';
		
		//2 row
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		
		//3 row
		$array[2][0]='Q';
		$array[2][1]='W';	
		$array[2][2]='B';
		$array[2][3]='R';
		
		System.out.println($array[1][3]);
		
		
		System.out.println("---------another way to great a 2d array----------------");

		int [][] array= {
				{10, 20, 30},
				{1, 2 , 3},
				{100, 200, 300}
				
		};
		System.out.println(array[2][1]);
		System.out.println(array[0][0]);
		System.out.println("size of array of integrers= "+array.length);
		
}}
