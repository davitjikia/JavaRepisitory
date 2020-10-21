package com.syntax.class07;

public class ClassLoop {
	
	//print numbers from 100 to 1 odd numbers

	public static void main(String[] args) {
	    
		int a=99;
		
		while (a>0) {
			
			System.out.print(a+"  ");
			a-=2;
		}
		//print numbers from 100 to 1 odd numbers     
		
		System.out.println("");
		System.out.println("--------Another example---------------\"");
		
		
		int b=100;
		
		while (b>0) {
			
			if ((b%2)!=0) {
				System.out.println(b+" ");
			}
		}b--;
	}

}
