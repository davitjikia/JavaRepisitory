package com.syntax.class10;

public class HomeWork1 {
	public static void main (String [] args) {
		
		String[] animals={"Cow", "Dog", "Cat", "Lion", "Zebra", "Pantera"};
		
		System.out.print(animals[0]+" "+animals[1]+" "+ animals[2]+" "+ animals[3]+" "+ animals[4] +" "+animals[5]);
		
		System.out.println("--------------------------");
		System.out.println("--------Second way------------------");
		
		
		String[] annimals=new String[6];
		annimals[0]="Cow";
		annimals[1]="Dog";
		annimals[2]= "Cat";
		annimals[3]="Lion";
		annimals[4]="Zebra";
		annimals[5]="Pantera";
		
		System.out.print(animals[0]+" "+animals[1]+" "+ animals[2]+" "+ animals[3]+" "+ animals[4] +" "+animals[5]);
		System.out.println("--------------------------");
		System.out.println("--------Therd way------------------");
	
		String[] anniimals= {"Cow", "Dog", "Cat", "Lion", "Zebra", "Pantera"};
		
		
		for(int i=1; i<anniimals.length; i++) {
			System.out.print(anniimals[i]+"  ");
			
			
			
		}
		System.out.println("--------------------------");
		System.out.println("--------fourth way------------------");
		
		String [] anniimmals=new String[6];
		anniimmals[0]="Cow";
		anniimmals[1]="Dog";
		anniimmals[2]= "Cat";
		anniimmals[3]="Lion";
		anniimmals[4]="Zebra";
		anniimmals[5]="Pantera";
		
		for (String ann:anniimmals) {
			System.out.print(ann+" ");
		}
	}
		
	}

