package com.syntax.class11;

public class ClassWorkesIvarjishe{
	public static void main (String [ ] args) {
		
		int[] array= {10,0,20,8,-1,77,56,};
		
		int max=array[0];
		
		for(int i=1; i<array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The largest number from array is "+max);
 	}

}
